package org.painye.designPattern.build.builder;

/**
 * @author painye
 * @Description 请求映射信息
 * @create 2025-06-12 21:19
 */
public class RequestMappingInfo {

    /**
     * 请求映射的名称
     */
    private String name ;

    /***
     * 支持的URL路径，如 /user/{id}
     */
    private String pathPatternsCondition ;

    /**
     * 另一种URL匹配模式
     */
    private String patternsCondition ;

    /**
     * 支持的请求方法类型： GET, POST
     */
    private String methodsCondition ;

    /**
     * 请求中必须包含或排除的参数
     */
    private String paramsCondition ;

    /**
     * 支持的请求头： Content-Type=application/json。
     */
    private String headersCondition ;

    /**
     * 中hi吃的内容类型：application/json。
     */
    private String consumesCondition ;

    /**
     * 支持的响应内容类型：如 application/xml。
     */
    private String producesCondition ;

    /**
     * 自定义条件
     */
    private String customConditionHolder ;

    /**
     * 额外的配置
     */
    private String options ;

    /**
     * Product
     */
    private RequestMappingInfo( String name,
                                String pathPatternsCondition,
                                String patternsCondition,
                                String methodsCondition, String paramsCondition,
                                String headersCondition, String consumesCondition,
                                String producesCondition, String customCondition,
                                String options) {


        this.name =  name;
        this.pathPatternsCondition = pathPatternsCondition;
        this.patternsCondition = patternsCondition;
        this.methodsCondition = methodsCondition;
        this.paramsCondition = paramsCondition;
        this.headersCondition = headersCondition;
        this.consumesCondition = consumesCondition;
        this.producesCondition = producesCondition;
        this.customConditionHolder = customCondition;
        this.options = options;
    }

    @Override
    public String toString() {
        return "RequestMappingInfo{" +
                "name='" + name + '\'' +
                ", pathPatternsCondition='" + pathPatternsCondition + '\'' +
                ", patternsCondition='" + patternsCondition + '\'' +
                ", methodsCondition='" + methodsCondition + '\'' +
                ", paramsCondition='" + paramsCondition + '\'' +
                ", headersCondition='" + headersCondition + '\'' +
                ", consumesCondition='" + consumesCondition + '\'' +
                ", producesCondition='" + producesCondition + '\'' +
                ", customConditionHolder='" + customConditionHolder + '\'' +
                ", options='" + options + '\'' +
                '}';
    }

    public static Builder paths(String paths) {
        return new DefaultBuilder(paths);
    }

    /**
     * Builder
     */
    public interface Builder {

        /**
         * 设置url的路径模式
         */
        Builder paths(String paths);

        /**
         * 设置请求方法
         */
        Builder methods(String methods);

        /**
         * 设置参数
         */
        Builder params(String params);

        /**
         * 设置请求头
         */
        Builder headers(String headers);

        /**
         * 设置支持的请求内容类型
         */
        Builder consumes(String consumes);

        /**
         * 设置支持的响应内容类型
         */
        Builder produces(String produces);

        /**
         * 设置映射的名称
         */
        Builder mappingName(String name);

        /**
         * 设置用户自定义的条件
         */
        Builder customCondition(String condition);

        /**
         *设置额外的选项
         */
        Builder options(String options);

        /**
         * 建造者模式中的抽象建造方法，创建实例
         * @return 实例
         */
        RequestMappingInfo build();

    }

    /**
     * Concrete Builder
     */
    private static class DefaultBuilder implements Builder {

        private String paths;

        private String methods;

        private String params;

        private String headers;

        private String consumes;

        private String produces;


        private String mappingName;

        private String customCondition;

        private String options;

        public DefaultBuilder(String paths) {
            this.paths = paths;
        }

        @Override
        public Builder paths(String paths) {
            this.paths = paths;
            return this;
        }

        @Override
        public Builder methods(String methods) {
            this.methods = methods;
            return this;
        }

        @Override
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        @Override
        public Builder headers(String headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public Builder consumes(String consumes) {
            this.consumes = consumes;
            return this;
        }

        @Override
        public Builder produces(String produces) {
            this.produces = produces;
            return this;
        }

        @Override
        public Builder mappingName(String name) {
            this.mappingName = name;
            return this;
        }

        @Override
        public Builder customCondition(String customCondition) {
            this.customCondition = customCondition;
            return this;
        }

        @Override
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        @Override
        public RequestMappingInfo build() {
            return new RequestMappingInfo(this.mappingName, this.paths, this.paths, methods,params,
                    headers,consumes,produces,customCondition,options);
        }
    }

    public static void main(String[] args) {
        RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths("/user").mappingName("1111")
                .consumes("application/json")
                .customCondition("11111111")
                .headers("Content-Type=application/json")
                .methods("GET")
                .produces("application/json")
                .options("1222")
                .params("key=345")
                .build();
        System.out.println(requestMappingInfo.toString());
    }



}
