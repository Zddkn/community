package cn.hunit.community.cache;

import cn.hunit.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get(){
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO web = new TagDTO();
        web.setCategoryName("前端");
        web.setTags(Arrays.asList("前端","javascript","typescript","ecmascript-6","css","css3","html","html5","node.js","npm","react.js","vue.js","angular","chrome","chrome-devtools","safari","webkit","edge","bootstrap","tailwind-css","antd","sass","less","postcss","yarn","postman","fiddler"));
        tagDTOS.add(web);

        TagDTO backend = new TagDTO();
        backend.setCategoryName("后端");
        backend.setTags(Arrays.asList("后端","go","php","lavarel","swoole","java","spring","springboot","node.js","express","python","flask","django","fastapi","c","c++","c#","ruby","ruby-on-rails","asp.net","scala","rust","爬虫"));
        tagDTOS.add(backend);
        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) || !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }

    public static void main(String[] args) {
        int i = (5 - 1) >>> 1;
        System.out.println(i);
    }
}
