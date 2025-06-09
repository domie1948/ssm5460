import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import fangyicuoshi from '@/views/modules/fangyicuoshi/list'
    import jinjiqingkuang from '@/views/modules/jinjiqingkuang/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import jiankangma from '@/views/modules/jiankangma/list'
    import xingdongguiji from '@/views/modules/xingdongguiji/list'
    import xueyuanxinxi from '@/views/modules/xueyuanxinxi/list'
    import tiwenshangbao from '@/views/modules/tiwenshangbao/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/fangyicuoshi',
        name: '防疫措施',
        component: fangyicuoshi
      }
          ,{
	path: '/jinjiqingkuang',
        name: '紧急情况',
        component: jinjiqingkuang
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/jiankangma',
        name: '健康码',
        component: jiankangma
      }
          ,{
	path: '/xingdongguiji',
        name: '行动轨迹',
        component: xingdongguiji
      }
          ,{
	path: '/xueyuanxinxi',
        name: '学院信息',
        component: xueyuanxinxi
      }
          ,{
	path: '/tiwenshangbao',
        name: '体温上报',
        component: tiwenshangbao
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
