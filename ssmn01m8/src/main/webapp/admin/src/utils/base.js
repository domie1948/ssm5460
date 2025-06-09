const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmn01m8/",
            name: "ssmn01m8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmn01m8/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "师生防疫登记备案系统设计"
        } 
    }
}
export default base
