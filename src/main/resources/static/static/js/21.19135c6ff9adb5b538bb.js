webpackJsonp([21],{"3+/E":function(t,e,a){e=t.exports=a("FZ+f")(!1),e.push([t.i,".mod_head{width:100%;padding:0 20px}.mod_head,.mod_head_h5{height:36px;line-height:36px;border-radius:5px;background:#5477ad}.mod_head_h5{font-size:14px;color:#fff;float:left}.go_back_click_div{width:50px;height:50px;float:right;margin-right:50px}.el-icon-back{font-size:18px;line-height:36px}.el-tabs__nav-wrap{width:97%;overflow:hidden;margin-bottom:-1px;position:relative;margin:auto}.el-table__empty-block{min-height:280px;font-size:30px;padding-top:60px;text-align:center;color:#d2cfcf;box-sizing:border-box}.el-table{border-radius:5px}.el-table th{text-align:center;background:#7fabd2}.el-table th .cell{background:#7fabd2;color:#fff}.dayreport_foot{min-height:800px;background:#f9f9f9}.table_style{width:100%;height:592px!important}.dayreport_foot_baojia_android,.dayreport_foot_baojia_ios{width:97%;height:529px;margin:0 auto 50px}",""])},Shpe:function(t,e,a){var l=a("3+/E");"string"==typeof l&&(l=[[t.i,l,""]]),l.locals&&(t.exports=l.locals);a("rjj0")("5a07755e",l,!0)},nq2h:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l,o=a("bOdI"),r=function(t){return t&&t.__esModule?t:{default:t}}(o),s=a("yt7g");e.default=(l={data:function(){return{baojia_android:[],baojia_ios:[],activeName:"second"}},computed:{},created:function(){this.YiChe(this.week)},methods:{YiChe:function(t){var e=this,a={platformName:"报价APP",startTime:t};(0,s.ajaxPost)("/intelligent/weekPlatformreport",a).then(function(t){var t="string"==typeof t?JSON.parse(t):t;200==t.status&&"success"==t.data.msg&&(e.baojia_android=t.data.result.android,e.baojia_ios=t.data.result.ios)}).catch(function(t){console.log("err",t)})}}},(0,r.default)(l,"computed",{week:function(){return this.$store.state.getWeek}}),(0,r.default)(l,"watch",{week:function(t,e){this.YiChe(t)}}),l)},rbbE:function(t,e,a){a("Shpe");var l=a("VU/8")(a("nq2h"),a("zEsf"),null,null);t.exports=l.exports},zEsf:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"dayreport_foot"},[a("div",{staticClass:"mod_head"},[a("h5",{staticClass:"mod_head_h5"},[t._v("报价APP分渠道数据")]),t._v(" "),a("div",{staticClass:"go_back_click_div"},[a("router-link",{attrs:{to:"/home/weekreport"}},[a("i",{staticClass:"el-icon-back"})])],1)]),t._v(" "),a("div",{staticClass:"main"},[[a("el-tabs",{model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},[a("el-tab-pane",{attrs:{name:"first"}},[a("span",{attrs:{slot:"label"},slot:"label"},[a("i",{staticClass:"el-icon-mobile-phone"}),t._v(" Android")]),t._v(" "),a("div",{staticClass:"dayreport_foot_baojia_android"},[a("el-table",{staticClass:"table_style",staticStyle:{width:"100%"},attrs:{data:t.baojia_android,border:!0,height:"250",border:""}},[a("el-table-column",{attrs:{prop:"channelName",label:"渠道名称"}}),t._v(" "),a("el-table-column",{attrs:{prop:"leadsCnt",label:"线索"}}),t._v(" "),a("el-table-column",{attrs:{prop:"clueRatio",label:"线索环比"}}),t._v(".\r\n                            "),a("el-table-column",{attrs:{prop:"leadsUserCnt",label:"用户"}}),t._v(" "),a("el-table-column",{attrs:{prop:"userRatio",label:"用户环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"leadsCost",label:"线索成本"}}),t._v(" "),a("el-table-column",{attrs:{prop:"consumeRatio",label:"环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"newUserCnt",label:"激活"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"激活环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"newUserCost",label:"激活成本"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"消费"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"消费成本"}})],1)],1)]),t._v(" "),a("el-tab-pane",{attrs:{name:"second"}},[a("span",{staticClass:"ios",attrs:{slot:"label"},slot:"label"},[a("i",{staticClass:"el-icon-mobile-phone"}),t._v(" IOS")]),t._v(" "),a("div",{staticClass:"dayreport_foot_baojia_ios"},[a("el-table",{staticClass:"table_style",staticStyle:{width:"100%"},attrs:{data:t.baojia_ios,border:!0,height:"250",border:""}},[a("el-table-column",{attrs:{prop:"channelName",label:"渠道名称"}}),t._v(" "),a("el-table-column",{attrs:{prop:"leadsCnt",label:"线索"}}),t._v(" "),a("el-table-column",{attrs:{prop:"clueRatio",label:"线索环比"}}),t._v(".\r\n                            "),a("el-table-column",{attrs:{prop:"leadsUserCnt",label:"用户"}}),t._v(" "),a("el-table-column",{attrs:{prop:"userRatio",label:"用户环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"leadsCost",label:"线索成本"}}),t._v(" "),a("el-table-column",{attrs:{prop:"consumeRatio",label:"环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"newUserCnt",label:"激活"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"激活环比"}}),t._v(" "),a("el-table-column",{attrs:{prop:"newUserCost",label:"激活成本"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"消费"}}),t._v(" "),a("el-table-column",{attrs:{prop:"",label:"消费成本"}})],1)],1)])],1)]],2)])},staticRenderFns:[]}}});