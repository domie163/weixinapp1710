const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm00wl9/",
            name: "ssm00wl9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm00wl9/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "居住证申报系统小程序"
        } 
    }
}
export default base
