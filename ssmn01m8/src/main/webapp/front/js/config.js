
var projectName = '师生防疫登记备案系统设计';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '体温上报',
	url: './pages/tiwenshangbao/list.html'
}, 
{
	name: '健康码',
	url: './pages/jiankangma/list.html'
}, 
{
	name: '行动轨迹',
	url: './pages/xingdongguiji/list.html'
}, 
{
	name: '防疫措施',
	url: './pages/fangyicuoshi/list.html'
}, 
{
	name: '紧急情况',
	url: './pages/jinjiqingkuang/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssmn01m8/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学院信息","menuJump":"列表","tableName":"xueyuanxinxi"}],"menu":"学院信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康码","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"行动轨迹","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"防疫措施","menuJump":"列表","tableName":"fangyicuoshi"}],"menu":"防疫措施管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"紧急情况","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"体温上报列表","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"健康码列表","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"行动轨迹列表","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹模块"},{"child":[{"buttons":["查看"],"menu":"防疫措施列表","menuJump":"列表","tableName":"fangyicuoshi"}],"menu":"防疫措施模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"紧急情况列表","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","修改"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"健康码","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"行动轨迹","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"紧急情况","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况管理"}],"frontMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"体温上报列表","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"健康码列表","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"行动轨迹列表","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹模块"},{"child":[{"buttons":["查看"],"menu":"防疫措施列表","menuJump":"列表","tableName":"fangyicuoshi"}],"menu":"防疫措施模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"紧急情况列表","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况模块"}],"roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","删除","修改"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"健康码","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"行动轨迹","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"紧急情况","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况管理"}],"frontMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"体温上报列表","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"健康码列表","menuJump":"列表","tableName":"jiankangma"}],"menu":"健康码模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"行动轨迹列表","menuJump":"列表","tableName":"xingdongguiji"}],"menu":"行动轨迹模块"},{"child":[{"buttons":["查看"],"menu":"防疫措施列表","menuJump":"列表","tableName":"fangyicuoshi"}],"menu":"防疫措施模块"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"紧急情况列表","menuJump":"列表","tableName":"jinjiqingkuang"}],"menu":"紧急情况模块"}],"roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
