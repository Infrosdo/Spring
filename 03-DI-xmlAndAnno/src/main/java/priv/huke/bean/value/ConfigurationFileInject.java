package priv.huke.bean.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component(value = "configurationFileInject")
@PropertySource(value = {"classpath:config.properties", "classpath:config_${anotherfile.configinject}.properties"}, ignoreResourceNotFound = false, encoding = "UTF-8")
public class ConfigurationFileInject {

    @Value("${app.name}")
    private String appName; // 这里的值来自application.properties，spring boot启动时默认加载此文件

    @Value("${book.name}")
    private String bookName; // 注入第一个配置外部文件属性

    @Value("${book.name.placeholder}")
    private String bookNamePlaceholder; // 注入第二个配置外部文件属性

    @Value("${spring.datasource.shareniu.url}")
    private String url; // 注入第二个配置外部文件属性

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Autowired
    private Environment env;  // 注入环境变量对象，存储注入的属性值

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("appName=").append(appName).append("\r\n")
                .append("bookName=").append(bookName).append("\r\n")
                .append("bookNamePlaceholder=").append(bookNamePlaceholder).append("\r\n")
                .append("env=").append(env).append("\r\n")
                // 从eniroment中获取属性值
                .append("env=").append(env.getProperty("book.name.placeholder")).append("\r\n")
                .append("url=").append(url);
        return sb.toString();
    }
}