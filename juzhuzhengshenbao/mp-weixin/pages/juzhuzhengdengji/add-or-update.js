(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/juzhuzhengdengji/add-or-update"],{"0e4d":function(n,e,i){"use strict";var t=i("fee6"),r=i.n(t);r.a},"780e":function(n,e,i){"use strict";i.r(e);var t=i("a953"),r=i.n(t);for(var u in t)"default"!==u&&function(n){i.d(e,n,(function(){return t[n]}))}(u);e["default"]=r.a},9745:function(n,e,i){"use strict";var t={"w-picker":function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"d167"))}},r=function(){var n=this,e=n.$createElement;n._self._c},u=[];i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return u})),i.d(e,"a",(function(){return t}))},a953:function(n,e,i){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var t=r(i("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function u(n,e,i,t,r,u,a){try{var h=n[u](a),s=h.value}catch(o){return void i(o)}h.done?e(s):Promise.resolve(s).then(t,r)}function a(n){return function(){var e=this,i=arguments;return new Promise((function(t,r){var a=n.apply(e,i);function h(n){u(a,t,r,h,s,"next",n)}function s(n){u(a,t,r,h,s,"throw",n)}h(void 0)}))}}var h=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("d167"))}.bind(null,i)).catch(i.oe)},s={data:function(){return{ruleForm:{shenbaobianhao:this.getUUID(),yonghuzhanghao:"",zhenshixingming:"",xingbie:"",nianling:"",chushengriqi:"",minzu:"",shenfenzheng:"",zhaopian:"",suozaihuji:"",zhengzhimianmao:"",lianxidianhua:"",huzhu:"",yuhuzhuguanxi:"",shenbaoshijian:"",sfsh:"",shhf:"",userid:""},huzhuOptions:[],huzhuIndex:0,user:{},ro:{shenbaobianhao:!1,yonghuzhanghao:!1,zhenshixingming:!1,xingbie:!1,nianling:!1,chushengriqi:!1,minzu:!1,shenfenzheng:!1,zhaopian:!1,suozaihuji:!1,zhengzhimianmao:!1,lianxidianhua:!1,huzhu:!1,yuhuzhuguanxi:!1,shenbaoshijian:!1,sfsh:!1,shhf:!1,userid:!1}}},components:{wPicker:h},computed:{},onLoad:function(){var e=a(t.default.mark((function e(i){var r,u,a,h;return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=n.getStorageSync("nowTable"),e.next=3,this.$api.session(r);case 3:if(u=e.sent,this.user=u.data,this.ruleForm.yonghuzhanghao=this.user.yonghuzhanghao,this.ruleForm.zhenshixingming=this.user.zhenshixingming,this.ruleForm.xingbie=this.user.xingbie,this.ruleForm.nianling=this.user.nianling,this.ruleForm.zhaopian=this.user.zhaopian,this.huzhuOptions="否,是".split(","),this.ruleForm.userid=n.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=n.getStorageSync("nickname")),!i.id){e.next=19;break}return this.ruleForm.id=i.id,e.next=17,this.$api.info("juzhuzhengdengji",this.ruleForm.id);case 17:u=e.sent,this.ruleForm=u.data;case 19:if(!i.cross){e.next=90;break}a=n.getStorageSync("crossObj"),e.t0=t.default.keys(a);case 22:if((e.t1=e.t0()).done){e.next=90;break}if(h=e.t1.value,"shenbaobianhao"!=h){e.next=28;break}return this.ruleForm.shenbaobianhao=a[h],this.ro.shenbaobianhao=!0,e.abrupt("continue",22);case 28:if("yonghuzhanghao"!=h){e.next=32;break}return this.ruleForm.yonghuzhanghao=a[h],this.ro.yonghuzhanghao=!0,e.abrupt("continue",22);case 32:if("zhenshixingming"!=h){e.next=36;break}return this.ruleForm.zhenshixingming=a[h],this.ro.zhenshixingming=!0,e.abrupt("continue",22);case 36:if("xingbie"!=h){e.next=40;break}return this.ruleForm.xingbie=a[h],this.ro.xingbie=!0,e.abrupt("continue",22);case 40:if("nianling"!=h){e.next=44;break}return this.ruleForm.nianling=a[h],this.ro.nianling=!0,e.abrupt("continue",22);case 44:if("chushengriqi"!=h){e.next=48;break}return this.ruleForm.chushengriqi=a[h],this.ro.chushengriqi=!0,e.abrupt("continue",22);case 48:if("minzu"!=h){e.next=52;break}return this.ruleForm.minzu=a[h],this.ro.minzu=!0,e.abrupt("continue",22);case 52:if("shenfenzheng"!=h){e.next=56;break}return this.ruleForm.shenfenzheng=a[h],this.ro.shenfenzheng=!0,e.abrupt("continue",22);case 56:if("zhaopian"!=h){e.next=60;break}return this.ruleForm.zhaopian=a[h],this.ro.zhaopian=!0,e.abrupt("continue",22);case 60:if("suozaihuji"!=h){e.next=64;break}return this.ruleForm.suozaihuji=a[h],this.ro.suozaihuji=!0,e.abrupt("continue",22);case 64:if("zhengzhimianmao"!=h){e.next=68;break}return this.ruleForm.zhengzhimianmao=a[h],this.ro.zhengzhimianmao=!0,e.abrupt("continue",22);case 68:if("lianxidianhua"!=h){e.next=72;break}return this.ruleForm.lianxidianhua=a[h],this.ro.lianxidianhua=!0,e.abrupt("continue",22);case 72:if("huzhu"!=h){e.next=76;break}return this.ruleForm.huzhu=a[h],this.ro.huzhu=!0,e.abrupt("continue",22);case 76:if("yuhuzhuguanxi"!=h){e.next=80;break}return this.ruleForm.yuhuzhuguanxi=a[h],this.ro.yuhuzhuguanxi=!0,e.abrupt("continue",22);case 80:if("shenbaoshijian"!=h){e.next=84;break}return this.ruleForm.shenbaoshijian=a[h],this.ro.shenbaoshijian=!0,e.abrupt("continue",22);case 84:if("userid"!=h){e.next=88;break}return this.ruleForm.userid=a[h],this.ro.userid=!0,e.abrupt("continue",22);case 88:e.next=22;break;case 90:this.styleChange();case 91:case"end":return e.stop()}}),e,this)})));function i(n){return e.apply(this,arguments)}return i}(),methods:{styleChange:function(){this.$nextTick((function(){}))},chushengriqiChange:function(n){this.ruleForm.chushengriqi=n.target.value,this.$forceUpdate()},shenbaoshijianConfirm:function(n){console.log(n),this.ruleForm.shenbaoshijian=n.result,this.$forceUpdate()},huzhuChange:function(n){this.huzhuIndex=n.target.value,this.ruleForm.huzhu=this.huzhuOptions[this.huzhuIndex]},zhaopianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.zhaopian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=a(t.default.mark((function n(){return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(!this.ruleForm.nianling||this.$validate.isIntNumer(this.ruleForm.nianling)){n.next=3;break}return this.$utils.msg("年龄应输入整数"),n.abrupt("return");case 3:if(!this.ruleForm.shenfenzheng||this.$validate.checkIdCard(this.ruleForm.shenfenzheng)){n.next=6;break}return this.$utils.msg("身份证应输入身份证格式"),n.abrupt("return");case 6:if(this.ruleForm.userid){n.next=9;break}return this.$utils.msg("用户id不能为空"),n.abrupt("return");case 9:if(!this.ruleForm.id){n.next=14;break}return n.next=12,this.$api.update("juzhuzhengdengji",this.ruleForm);case 12:n.next=16;break;case 14:return n.next=16,this.$api.add("juzhuzhengdengji",this.ruleForm);case 16:this.$utils.msgBack("提交成功");case 17:case"end":return n.stop()}}),n,this)})));function e(){return n.apply(this,arguments)}return e}(),optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,r=e.getDate();return"start"===n?i-=60:"end"===n&&(i+=2),t=t>9?t:"0"+t,r=r>9?r:"0"+r,"".concat(i,"-").concat(t,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};e.default=s}).call(this,i("543d")["default"])},c6a1:function(n,e,i){"use strict";i.r(e);var t=i("9745"),r=i("780e");for(var u in r)"default"!==u&&function(n){i.d(e,n,(function(){return r[n]}))}(u);i("0e4d");var a,h=i("f0c5"),s=Object(h["a"])(r["default"],t["b"],t["c"],!1,null,"e646463c",null,!1,t["a"],a);e["default"]=s.exports},d1c6:function(n,e,i){"use strict";(function(n){i("3606"),i("921b");t(i("66fd"));var e=t(i("c6a1"));function t(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,i("543d")["createPage"])},fee6:function(n,e,i){}},[["d1c6","common/runtime","common/vendor"]]]);