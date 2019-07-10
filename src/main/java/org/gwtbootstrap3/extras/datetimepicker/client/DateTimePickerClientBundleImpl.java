package org.gwtbootstrap3.extras.datetimepicker.client;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2019 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtproject.resources.client.ResourcePrototype;

public class DateTimePickerClientBundleImpl implements org.gwtbootstrap3.extras.datetimepicker.client.DateTimePickerClientBundle {

    private static DateTimePickerClientBundleImpl _instance0 = new DateTimePickerClientBundleImpl();
    private static java.util.HashMap<String, ResourcePrototype> resourceMap;
    private static org.gwtproject.resources.client.TextResource dateTimePicker;
    private static org.gwtproject.resources.client.TextResource ar;
    private static org.gwtproject.resources.client.TextResource az;
    private static org.gwtproject.resources.client.TextResource bg;
    private static org.gwtproject.resources.client.TextResource bn;
    private static org.gwtproject.resources.client.TextResource ca;
    private static org.gwtproject.resources.client.TextResource cs;
    private static org.gwtproject.resources.client.TextResource da;
    private static org.gwtproject.resources.client.TextResource de;
    private static org.gwtproject.resources.client.TextResource ee;
    private static org.gwtproject.resources.client.TextResource el;
    private static org.gwtproject.resources.client.TextResource es;
    private static org.gwtproject.resources.client.TextResource fi;
    private static org.gwtproject.resources.client.TextResource fr;
    private static org.gwtproject.resources.client.TextResource he;
    private static org.gwtproject.resources.client.TextResource hr;
    private static org.gwtproject.resources.client.TextResource hu;
    private static org.gwtproject.resources.client.TextResource id;
    private static org.gwtproject.resources.client.TextResource is;
    private static org.gwtproject.resources.client.TextResource it;
    private static org.gwtproject.resources.client.TextResource ja;
    private static org.gwtproject.resources.client.TextResource ka;
    private static org.gwtproject.resources.client.TextResource ko;
    private static org.gwtproject.resources.client.TextResource lt;
    private static org.gwtproject.resources.client.TextResource lv;
    private static org.gwtproject.resources.client.TextResource ms;
    private static org.gwtproject.resources.client.TextResource nb;
    private static org.gwtproject.resources.client.TextResource nl;
    private static org.gwtproject.resources.client.TextResource no;
    private static org.gwtproject.resources.client.TextResource pl;
    private static org.gwtproject.resources.client.TextResource pt_BR;
    private static org.gwtproject.resources.client.TextResource pt;
    private static org.gwtproject.resources.client.TextResource ro;
    private static org.gwtproject.resources.client.TextResource rs_latin;
    private static org.gwtproject.resources.client.TextResource rs;
    private static org.gwtproject.resources.client.TextResource ru;
    private static org.gwtproject.resources.client.TextResource sk;
    private static org.gwtproject.resources.client.TextResource sl;
    private static org.gwtproject.resources.client.TextResource sv;
    private static org.gwtproject.resources.client.TextResource sw;
    private static org.gwtproject.resources.client.TextResource th;
    private static org.gwtproject.resources.client.TextResource tr;
    private static org.gwtproject.resources.client.TextResource ua;
    private static org.gwtproject.resources.client.TextResource uk;
    private static org.gwtproject.resources.client.TextResource zh_CN;
    private static org.gwtproject.resources.client.TextResource zh_TW;

    private void dateTimePickerInitializer() {
        dateTimePicker = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/bootstrap-datetimepicker-2.4.4.min.cache.js
            public String getText() {
                StringBuilder builder = new StringBuilder();
                builder.append("(function(a){if(typeof define===\"function\"&&define.amd){define([\"jquery\"],a)}else{if(typeof exports===\"object\"){a(require(\"jquery\"))}else{a(jQuery)}}}(function(d,f){if(!(\"indexOf\" in Array.prototype)){Array.prototype.indexOf=function(k,j){if(j===f){j=0}if(j<0){j+=this.length}if(j<0){j=0}for(var l=this.length;j<l;j++){if(j in this&&this[j]===k){return j}}return -1}}function a(){var q,k,p,l,j,n,m,o;k=(new Date()).toString();p=((m=k.split(\"(\")[1])!=null?m.slice(0,-1):0)||k.split(\" \");if(p instanceof Array){n=[];for(var l=0,j=p.length;l<j;l++){o=p[l];if((q=(m=o.match(/\\b[A-Z]+\\b/))!==null)?m[0]:0){n.push(q)}}p=n.pop()}return p}function h(){return new Date(Date.UTC.apply(Date,arguments))}var g=function(k,j){var m=this;this.element=d(k);this.container=j.container||\"body\";this.language=j.language||this.element.data(\"date-language\")||\"en\";this.language=this.language in e?this.language:this.language.split(\"-\")[0];this.language=this.language in e?this.language:\"en\";this.isRTL=e[this.language].rtl||false;this.formatType=j.formatType||this.element.data(\"format-type\")||\"standard\";this.format=c.parseFormat(j.format||this.element.data(\"date-format\")||e[this.language].format||c.getDefaultFormat(this.formatType,\"input\"),this.formatType);this.isInline=false;this.isVisible=false;this.isInput=this.element.is(\"input\");this.fontAwesome=j.fontAwesome||this.element.data(\"font-awesome\")||false;this.bootcssVer=j.bootcssVer||(this.isInput?(this.element.is(\".form-control\")?3:2):(this.bootcssVer=this.element.is(\".input-group\")?3:2));this.component=this.element.is(\".date\")?(this.bootcssVer===3?this.element.find(\".input-group-addon .glyphicon-th, .input-group-addon .glyphicon-time, .input-group-addon .glyphicon-remove, .input-group-addon .glyphicon-calendar, .input-group-addon .fa-calendar, .input-group-addon .fa-clock-o\").parent():this.element.find(\".add-on .icon-th, .add-on .icon-time, .add-on .icon-calendar, .add-on .fa-calendar, .add-on .fa-clock-o\").parent()):false;this.componentReset=this.element.is(\".date\")?(this.bootcssVer===3?this.element.find(\".input-group-addon .glyphicon-remove, .input-group-addon .fa-times\").parent():this.element.find(\".add-on .icon-remove, .add-on .fa-times\").parent()):false;this.hasInput=this.component&&this.element.find(\"input\").length;if(this.component&&this.component.length===0){this.component=false}this.linkField=j.linkField||this.element.data(\"link-field\")||false;this.linkFormat=c.parseFormat(j.linkFormat||this.element.data(\"link-format\")||c.getDefaultFormat(this.formatType,\"link\"),this.formatType);this.minuteStep=j.minuteStep||this.element.data(\"minute-step\")||5;this.pickerPosition=j.pickerPosition||this.element.data(\"picker-position\")||\"bottom-right\";this.showMeridian=j.showMeridian||this.element.data(\"show-meridian\")||false;this.initialDate=j.initialDate||new Date();this.zIndex=j.zIndex||this.element.data(\"z-index\")||f;this.title=typeof j.title===\"undefined\"?false:j.title;this.timezone=j.timezone||a();this.icons={leftArrow:this.fontAwesome?\"fa-arrow-left\":(this.bootcssVer===3?\"glyphicon-arrow-left\":\"icon-arrow-left\"),rightArrow:this.fontAwesome?\"fa-arrow-right\":(this.bootcssVer===3?\"glyphicon-arrow-right\":\"icon-arrow-right\")};this.icontype=this.fontAwesome?\"fa\":\"glyphicon\";this._attachEvents();this.clickedOutside=function(n){if(d(n.target).closest(\".datetimepicker\").length===0){m.hide()}};this.formatViewType=\"datetime\";if(\"formatViewType\" in j){this.formatViewType=j.formatViewType}else{if(\"formatViewType\" in this.element.data()){this.formatViewType=this.element.data(\"formatViewType\")}}this.minView=0;if(\"minView\" in j){this.minView=j.minView}else{if(\"minView\" in this.element.data()){this.minView=this.element.data(\"min-view\")}}this.minView=c.convertViewMode(this.minView);this.maxView=c.modes.length-1;if(\"maxView\" in j){this.maxView=j.maxView}else{if(\"maxView\" in this.element.data()){this.maxView=this.element.data(\"max-view\")}}this.maxView=c.convertViewMode(this.maxView);this.wheelViewModeNavigation=false;if(\"wheelViewModeNavigation\" in j){this.wheelViewModeNavigation=j.wheelViewModeNavigation}else{if(\"wheelViewModeNavigation\" in this.element.data()){this.wheelViewModeNavigation=this.element.data(\"view-mode-wheel-navigation\")}}this.wheelViewModeNavigationInverseDirection=false;if(\"wheelViewModeNavigationInverseDirection\" in j){this.wheelViewModeNavigationInverseDirection=j.wheelViewModeNavigationInverseDirection}else{if(\"wheelViewModeNavigationInverseDirection\" in this.element.data()){this.wheelViewModeNavigationInverseDirection=this.element.data(\"view-mode-wheel-navigation-inverse-dir\")}}this.wheelViewModeNavigationDelay=100;if(\"wheelViewModeNavigationDelay\" in j){this.wheelViewModeNavigationDelay=j.wheelViewModeNavigationDelay}else{if(\"wheelViewModeNavigationDelay\" in this.element.data()){this.wheelViewModeNavigationDelay=this.element.data(\"view-mode-wheel-navigation-delay\")}}this.startViewMode=2;if(\"startView\" in j){this.startViewMode=j.startView}else{if(\"startView\" in this.element.data()){this.startViewMode=this.element.data(\"start-view\")}}this.startViewMode=c.convertViewMode(this.startViewMode);this.viewMode=this.startViewMode;this.viewSelect=this.minView;if(\"viewSelect\" in j){this.viewSelect=j.viewSelect}else{if(\"viewSelect\" in this.element.data()){this.viewSelect=this.element.data(\"view-select\")}}this.viewSelect=c.convertViewMode(this.viewSelect);this.forceParse=true;if(\"forceParse\" in j){this.forceParse=j.forceParse}else{if(\"dateForceParse\" in this.element.data()){this.forceParse=this.element.data(\"date-force-parse\")}}var l=this.bootcssVer===3?c.templateV3:c.template;while(l.indexOf(\"{iconType}\")!==-1){l=l.replace(\"{iconType}\",this.icontype)}while(l.indexOf(\"{leftArrow}\")!==-1){l=l.replace(\"{leftArrow}\",this.icons.leftArrow)}while(l.indexOf(\"{rightArrow}\")!==-1){l=l.replace(\"{rightArrow}\",this.icons.rightArrow)}this.picker=d(l).appendTo(this.isInline?this.element:this.container).on({click:d.proxy(this.click,this),mousedown:d.proxy(this.mousedown,this)});if(this.wheelViewModeNavigation){if(d.fn.mousewheel){this.picker.on({mousewheel:d.proxy(this.mousewheel,this)})}else{console.log(\"Mouse Wheel event is not supported. Please include the jQuery Mouse Wheel plugin before enabling this option\")}}if(this.isInline){this.picker.addClass(\"datetimepicker-inline\")}else{this.picker.addClass(\"datetimepicker-dropdown-\"+this.pickerPosition+\" dropdown-menu\")}if(this.isRTL){this.picker.addClass(\"datetimepicker-rtl\");var i=this.bootcssVer===3?\".prev span, .next span\":\".prev i, .next i\";this.picker.find(i).toggleClass(this.icons.leftArrow+\" \"+this.icons.rightArrow)}d(document).on(\"mousedown touchend\",this.clickedOutside);this.autoclose=false;if(\"autoclose\" in j){this.autoclose=j.autoclose}else{if(\"dateAutoclose\" in this.element.data()){this.autoclose=this.element.data(\"date-autoclose\")}}this.keyboardNavigation=true;if(\"keyboardNavigation\" in j){this.keyboardNavigation=j.keyboardNavigation}else{if(\"dateKeyboardNavigation\" in this.element.data()){this.keyboardNavigation=this.element.data(\"date-keyboard-navigation\")}}this.todayBtn=(j.todayBtn||this.element.data(\"date-today-btn\")||false);this.clearBtn=(j.clearBtn||this.element.data(\"date-clear-btn\")||false);this.todayHighlight=(j.todayHighlight||this.element.data(\"date-today-highlight\")||false);this.weekStart=0;if(typeof j.weekStart!==\"undefined\"){this.weekStart=j.weekStart}else{if(typeof this.element.data(\"date-weekstart\")!==\"undefined\"){this.weekStart=this.element.data(\"date-weekstart\")}else{if(typeof e[this.language].weekStart!==\"undefined\"){this.weekStart=e[this.language].weekStart}}}this.weekStart=this.weekStart%7;this.weekEnd=((this.weekStart+6)%7);this.onRenderDay=function(n){var p=(j.onRenderDay||function(){return[]})(n);if(typeof p===\"string\"){p=[p]}var o=[\"day\"];return o.concat((p?p:[]))};this.onRenderHour=function(n){var p=(j.onRenderHour||function(){return[]})(n);var o=[\"hour\"];if(typeof p===\"string\"){p=[p]}return o.concat((p?p:[]))};this.onRenderMinute=function(n){var p=(j.onRenderMinute||function(){return[]})(n);var o=[\"minute\"];if(typeof p===\"string\"){p=[p]}if(n<this.startDate||n>this.endDate){o.push(\"disabled\")}else{if(Math.floor(this.date.getUTCMinutes()/this.minuteStep)===Math.floor(n.getUTCMinutes()/this.minuteStep)){o.push(\"active\")}}return o.concat((p?p:[]))};this.onRenderYear=function(o){var q=(j.onRenderYear||function(){return[]})(o);var p=[\"year\"];if(typeof q===\"string\"){q=[q]}if(this.date.getUTCFullYear()===o.getUTCFullYear()){p.push(\"active\")}var n=o.getUTCFullYear();var r=this.endDate.getUTCFullYear();if(o<this.startDate||n>r){p.push(\"disabled\")}return p.concat((q?q:[]))};this.onRenderMonth=function(n){var p=(j.onRenderMonth||function(){return[]})(n);var o=[\"month\"];if(typeof p===\"string\"){p=[p]}return o.concat((p?p:[]))};this.startDate=new Date(-8639968443048000);this.endDate=new Date(8639968443048000);this.datesDisabled=[];this.daysOfWeekDisabled=[];this.setStartDate(j.startDate||this.element.data(\"date-startdate\"));this.setEndDate(j.endDate||this.element.data(\"date-enddate\"));this.setDatesDisabled(j.datesDisabled||this.element.data(\"date-dates-disabled\"));this.setDaysOfWeekDisabled(j.daysOfWeekDisabled||this.element.data(\"date-days-of-week-disabled\"));this.setMinutesDisabled(j.minutesDisabled||this.element.data(\"date-minute-disabled\"));this.setHoursDisabled(j.hoursDisabled||this.element.data(\"date-hour-disabled\"));this.fillDow();this.fillMonths();this.update();this.showMode();if(this.isInline){this.show()}};g.prototype={constructor:g,_events:[],_attachEvents:function(){this._detachEvents();if(this.isInput){this._events=[[this.element,{focus:d.proxy(this.show,this),keyup:d.proxy(this.update,this),keydown:d.proxy(this.keydown,this)}]]}else{if(this.component&&this.hasInput){this._events=[[this.element.find(\"input\"),{focus:d.proxy(this.show,this),keyup:d.proxy(this.update,this),keydown:d.proxy(this.keydown,this)}],[this.component,{click:d.proxy(this.show,this)}]];if(this.componentReset){this._events.push([this.componentReset,{click:d.proxy(this.reset,this)}])}}else{if(this.element.is(\"div\")){this.isInline=true}else{this._events=[[this.element,{click:d.proxy(this.show,this)}]]}}}for(var j=0,k,l;j<this._events.length;j++){k=this._events[j][0];l=this._events[j][1];k.on(l)}},_detachEvents:function(){for(var j=0,k,l;j<this._events.length;j++){k=this._events[j][0];l=this._events[j][1];k.off(l)}this._events=[]},show:function(i){this.picker.show();this.height=this.component?this.component.outerHeight():this.element.outerHeight();if(this.forceParse){this.update()}this.place();d(window).on(\"resize\",d.proxy(this.place,this));if(i){i.stopPropagation();i.preventDefault()}this.isVisible=true;this.element.trigger({type:\"show\",date:this.date})},hide:function(){if(!this.isVisible){return}if(this.isInline){return}this.picker.hide();d(window).off(\"resize\",this.place);this.viewMode=this.startViewMode;this.showMode();if(!this.isInput){d(document).off(\"mousedown\",this.hide)}if(this.forceParse&&(this.isInput&&this.element.val()||this.hasInput&&this.element.find(\"input\").val())){this.setValue()}this.isVisible=false;this.element.trigger({type:\"hide\",date:this.date})},remove:function(){this._detachEvents();d(document).off(\"mousedown\",this.clickedOutside);this.picker.remove();delete this.picker;delete this.element.data().datetimepicker},getDate:function(){var i=this.getUTCDate();if(i===null){return null}return new Date(i.getTime()+(i.getTimezoneOffset()*60000))},getUTCDate:function(){return this.date},getInitialDate:function(){return this.initialDate},setInitialDate:function(i){this.initialDate=i},setDate:function(i){this.setUTCDate(new Date(i.getTime()-(i.getTimezoneOffset()*60000)))},setUTCDate:function(i){if(i>=this.startDate&&i<=this.endDate){this.date=i;this.setValue();this.viewDate=this.date;this.fill()}else{this.element.trigger({type:\"outOfRange\",date:i,startDate:this.startDate,endDate:this.endDate})}},setFormat:function(j){this.format=c.parseFormat(j,this.formatType);var i;if(this.isInput){i=this.element}else{if(this.component){i=this.element.find(\"input\")}}if(i&&i.val()){this.setValue()}},setValue:function(){var i=this.getFormattedDate();if(!this.isInput){if(this.component){this.element.find(\"input\").val(i)}this.element.data(\"date\",i)}else{this.element.val(i)}if(this.linkField){d(\"#\"+this.linkField).val(this.getFormattedDate(this.linkFormat))}},getFormattedDate:function(i){i=i||this.format;return c.formatDate(this.date,i,this.language,this.formatType,this.timezone)},setStartDate:function(i){this.startDate=i||this.startDate;if(this.startDate.valueOf()!==8639968443048000){this.startDate=c.parseDate(this.startDate,this.format,this.language,this.formatType,this.timezone)}this.update();this.updateNavArrows()},setEndDate:function(i){this.endDate=i||this.endDate;if(this.endDate.valueOf()!==8639968443048000){this.endDate=c.parseDate(this.endDate,this.format,this.language,this.formatType,this.timezone)}this.update();this.updateNavArrows()},setDatesDisabled:function(j){this.datesDisabled=j||[];if(!d.isArray(this.datesDisabled)){this.datesDisabled=this.datesDisabled.split(/,\\s*/)}var i=this;this.datesDisabled=d.map(this.datesDisabled,function(k){return c.parseDate(k,i.format,i.language,i.formatType,i.timezone).toDateString()});this.update();this.updateNavArrows()},setTitle:function(i,j){return this.picker.find(i).find(\"th:eq(1)\").text(this.title===false?j:this.title)},setDaysOfWeekDisabled:function(i){this.daysOfWeekDisabled=i||[];if(!d.isArray(this.daysOfWeekDisabled)){this.daysOfWeekDisabled=this.daysOfWeekDisabled.split(/,\\s*/)}this.daysOfWeekDisabled=d.map(this.daysOfWeekDisabled,function(j){return parseInt(j,10)});this.update();this.updateNavArrows()},setMinutesDisabled:function(i){this.minutesDisabled=i||[];if(!d.isArray(this.minutesDisabled)){this.minutesDisabled=this.minutesDisabled.split(/,\\s*/)}this.minutesDisabled=d.map(this.minutesDisabled,function(j){return parseInt(j,10)});this.update();this.updateNavArrows()},setHoursDisabled:function(i){this.hoursDisabled=i||[];if(!d.isArray(this.hoursDisabled)){this.hoursDisabled=this.hoursDisabled.split(/,\\s*/)}this.hoursDisabled=d.map(this.hoursDisabled,function(j){return parseInt(j,10)});this.update();this.updateNavArrows()},place:function(){if(this.isInline){return}if(!this.zIndex){var j=0;d(\"div\").each(function(){var o=parseInt(d(this).css(\"zIndex\"),10);if(o>j){j=o}});this.zIndex=j+10}var n,m,l,k;if(this.container instanceof d){k=this.container.offset()}else{k=d(this.container).offset()}if(this.component){n=this.component.offset();l=n.left;if(this.pickerPosition===\"bottom-left\"||this.pickerPosition===\"top-left\"){l+=this.component.outerWidth()-this.picker.outerWidth()}}else{n=this.element.offset();l=n.left;if(this.pickerPosition===\"bottom-left\"||this.pickerPosition===\"top-left\"){l+=this.element.outerWidth()-this.picker.outerWidth()}}var i=document.body.clientWidth||window.innerWidth;if(l+220>i){l=i-220}if(this.pickerPosition===\"top-left\"||this.pickerPosition===\"top-right\"){m=n.top-this.picker.outerHeight()}else{m=n.top+this.height}m=m-k.top;l=l-k.left;this.picker.css({top:m,left:l,zIndex:this.zIndex})},hour_minute:\"^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]\",update:function(){var i,j=false;if(arguments&&arguments.length&&(typeof arguments[0]===\"string\"||arguments[0] instanceof Date)){i=arguments[0];j=true}else{i=(this.isInput?this.element.val():this.element.find(\"input\").val())||this.element.data(\"date\")||this.initialDate;if(typeof i===\"string\"){i=i.replace(/^\\s+|\\s+$/g,\"\")}}if(!i){i=new Date();j=false}if(typeof i===\"string\"){if(new RegExp(this.hour_minute).test(i)||new RegExp(this.hour_minute+\":[0-5][0-9]\").test(i)){i=this.getDate()}}this.date=c.parseDate(i,this.format,this.language,this.formatType,this.timezone);if(j){this.setValue()}if(this.date<this.startDate){this.viewDate=new Date(this.startDate)}else{if(this.date>this.endDate){this.viewDate=new Date(this.endDate)}else{this.viewDate=new Date(this.date)}}this.fill()},fillDow:function(){var i=this.weekStart,j=\"<tr>\";while(i<this.weekStart+7){j+='<th class=\"dow\">'+e[this.language].daysMin[(i++)%7]+\"</th>\"}j+=\"</tr>\";this.picker.find(\".datetimepicker-days thead\").append(j)},fillMonths:function(){var l=\"\";var m=new Date(this.viewDate);for(var k=0;k<12;k++){m.setUTCMonth(k);var j=this.onRenderMonth(m);l+='<span class=\"'+j.join(\" \")+'\">'+e[this.language].monthsShort[k]+\"</span>\"}this.picker.find(\".datetimepicker-months td\").htm");
                builder.append("l(l)},fill:function(){if(!this.date||!this.viewDate){return}var E=new Date(this.viewDate),t=E.getUTCFullYear(),G=E.getUTCMonth(),n=E.getUTCDate(),A=E.getUTCHours(),w=this.startDate.getUTCFullYear(),B=this.startDate.getUTCMonth(),p=this.endDate.getUTCFullYear(),x=this.endDate.getUTCMonth()+1,q=(new h(this.date.getUTCFullYear(),this.date.getUTCMonth(),this.date.getUTCDate())).valueOf(),D=new Date();this.setTitle(\".datetimepicker-days\",e[this.language].months[G]+\" \"+t);if(this.formatViewType===\"time\"){var k=this.getFormattedDate();this.setTitle(\".datetimepicker-hours\",k);this.setTitle(\".datetimepicker-minutes\",k)}else{this.setTitle(\".datetimepicker-hours\",n+\" \"+e[this.language].months[G]+\" \"+t);this.setTitle(\".datetimepicker-minutes\",n+\" \"+e[this.language].months[G]+\" \"+t)}this.picker.find(\"tfoot th.today\").text(e[this.language].today||e.en.today).toggle(this.todayBtn!==false);this.picker.find(\"tfoot th.clear\").text(e[this.language].clear||e.en.clear).toggle(this.clearBtn!==false);this.updateNavArrows();this.fillMonths();var I=h(t,G-1,28,0,0,0,0),z=c.getDaysInMonth(I.getUTCFullYear(),I.getUTCMonth());I.setUTCDate(z);I.setUTCDate(z-(I.getUTCDay()-this.weekStart+7)%7);var j=new Date(I);j.setUTCDate(j.getUTCDate()+42);j=j.valueOf();var r=[];var F;while(I.valueOf()<j){if(I.getUTCDay()===this.weekStart){r.push(\"<tr>\")}F=this.onRenderDay(I);if(I.getUTCFullYear()<t||(I.getUTCFullYear()===t&&I.getUTCMonth()<G)){F.push(\"old\")}else{if(I.getUTCFullYear()>t||(I.getUTCFullYear()===t&&I.getUTCMonth()>G)){F.push(\"new\")}}if(this.todayHighlight&&I.getUTCFullYear()===D.getFullYear()&&I.getUTCMonth()===D.getMonth()&&I.getUTCDate()===D.getDate()){F.push(\"today\")}if(I.valueOf()===q){F.push(\"active\")}if((I.valueOf()+86400000)<=this.startDate||I.valueOf()>this.endDate||d.inArray(I.getUTCDay(),this.daysOfWeekDisabled)!==-1||d.inArray(I.toDateString(),this.datesDisabled)!==-1){F.push(\"disabled\")}r.push('<td class=\"'+F.join(\" \")+'\">'+I.getUTCDate()+\"</td>\");if(I.getUTCDay()===this.weekEnd){r.push(\"</tr>\")}I.setUTCDate(I.getUTCDate()+1)}this.picker.find(\".datetimepicker-days tbody\").empty().append(r.join(\"\"));r=[];var u=\"\",C=\"\",s=\"\";var l=this.hoursDisabled||[];E=new Date(this.viewDate);for(var y=0;y<24;y++){E.setUTCHours(y);F=this.onRenderHour(E);if(l.indexOf(y)!==-1){F.push(\"disabled\")}var v=h(t,G,n,y);if((v.valueOf()+3600000)<=this.startDate||v.valueOf()>this.endDate){F.push(\"disabled\")}else{if(A===y){F.push(\"active\")}}if(this.showMeridian&&e[this.language].meridiem.length===2){C=(y<12?e[this.language].meridiem[0]:e[this.language].meridiem[1]);if(C!==s){if(s!==\"\"){r.push(\"</fieldset>\")}r.push('<fieldset class=\"hour\"><legend>'+C.toUpperCase()+\"</legend>\")}s=C;u=(y%12?y%12:12);if(y<12){F.push(\"hour_am\")}else{F.push(\"hour_pm\")}r.push('<span class=\"'+F.join(\" \")+'\">'+u+\"</span>\");if(y===23){r.push(\"</fieldset>\")}}else{u=y+\":00\";r.push('<span class=\"'+F.join(\" \")+'\">'+u+\"</span>\")}}this.picker.find(\".datetimepicker-hours td\").html(r.join(\"\"));r=[];u=\"\";C=\"\";s=\"\";var m=this.minutesDisabled||[];E=new Date(this.viewDate);for(var y=0;y<60;y+=this.minuteStep){if(m.indexOf(y)!==-1){continue}E.setUTCMinutes(y);E.setUTCSeconds(0);F=this.onRenderMinute(E);if(this.showMeridian&&e[this.language].meridiem.length===2){C=(A<12?e[this.language].meridiem[0]:e[this.language].meridiem[1]);if(C!==s){if(s!==\"\"){r.push(\"</fieldset>\")}r.push('<fieldset class=\"minute\"><legend>'+C.toUpperCase()+\"</legend>\")}s=C;u=(A%12?A%12:12);r.push('<span class=\"'+F.join(\" \")+'\">'+u+\":\"+(y<10?\"0\"+y:y)+\"</span>\");if(y===59){r.push(\"</fieldset>\")}}else{u=y+\":00\";r.push('<span class=\"'+F.join(\" \")+'\">'+A+\":\"+(y<10?\"0\"+y:y)+\"</span>\")}}this.picker.find(\".datetimepicker-minutes td\").html(r.join(\"\"));var J=this.date.getUTCFullYear();var o=this.setTitle(\".datetimepicker-months\",t).end().find(\".month\").removeClass(\"active\");if(J===t){o.eq(this.date.getUTCMonth()).addClass(\"active\")}if(t<w||t>p){o.addClass(\"disabled\")}if(t===w){o.slice(0,B).addClass(\"disabled\")}if(t===p){o.slice(x).addClass(\"disabled\")}r=\"\";t=parseInt(t/10,10)*10;var H=this.setTitle(\".datetimepicker-years\",t+\"-\"+(t+9)).end().find(\"td\");t-=1;E=new Date(this.viewDate);for(var y=-1;y<11;y++){E.setUTCFullYear(t);F=this.onRenderYear(E);if(y===-1||y===10){F.push(b)}r+='<span class=\"'+F.join(\" \")+'\">'+t+\"</span>\";t+=1}H.html(r);this.place()},updateNavArrows:function(){var m=new Date(this.viewDate),k=m.getUTCFullYear(),l=m.getUTCMonth(),j=m.getUTCDate(),i=m.getUTCHours();switch(this.viewMode){case 0:if(k<=this.startDate.getUTCFullYear()&&l<=this.startDate.getUTCMonth()&&j<=this.startDate.getUTCDate()&&i<=this.startDate.getUTCHours()){this.picker.find(\".prev\").css({visibility:\"hidden\"})}else{this.picker.find(\".prev\").css({visibility:\"visible\"})}if(k>=this.endDate.getUTCFullYear()&&l>=this.endDate.getUTCMonth()&&j>=this.endDate.getUTCDate()&&i>=this.endDate.getUTCHours()){this.picker.find(\".next\").css({visibility:\"hidden\"})}else{this.picker.find(\".next\").css({visibility:\"visible\"})}break;case 1:if(k<=this.startDate.getUTCFullYear()&&l<=this.startDate.getUTCMonth()&&j<=this.startDate.getUTCDate()){this.picker.find(\".prev\").css({visibility:\"hidden\"})}else{this.picker.find(\".prev\").css({visibility:\"visible\"})}if(k>=this.endDate.getUTCFullYear()&&l>=this.endDate.getUTCMonth()&&j>=this.endDate.getUTCDate()){this.picker.find(\".next\").css({visibility:\"hidden\"})}else{this.picker.find(\".next\").css({visibility:\"visible\"})}break;case 2:if(k<=this.startDate.getUTCFullYear()&&l<=this.startDate.getUTCMonth()){this.picker.find(\".prev\").css({visibility:\"hidden\"})}else{this.picker.find(\".prev\").css({visibility:\"visible\"})}if(k>=this.endDate.getUTCFullYear()&&l>=this.endDate.getUTCMonth()){this.picker.find(\".next\").css({visibility:\"hidden\"})}else{this.picker.find(\".next\").css({visibility:\"visible\"})}break;case 3:case 4:if(k<=this.startDate.getUTCFullYear()){this.picker.find(\".prev\").css({visibility:\"hidden\"})}else{this.picker.find(\".prev\").css({visibility:\"visible\"})}if(k>=this.endDate.getUTCFullYear()){this.picker.find(\".next\").css({visibility:\"hidden\"})}else{this.picker.find(\".next\").css({visibility:\"visible\"})}break}},mousewheel:function(j){j.preventDefault();j.stopPropagation();if(this.wheelPause){return}this.wheelPause=true;var i=j.originalEvent;var l=i.wheelDelta;var k=l>0?1:(l===0)?0:-1;if(this.wheelViewModeNavigationInverseDirection){k=-k}this.showMode(k);setTimeout(d.proxy(function(){this.wheelPause=false},this),this.wheelViewModeNavigationDelay)},click:function(m){m.stopPropagation();m.preventDefault();var n=d(m.target).closest(\"span, td, th, legend\");if(n.is(\".\"+this.icontype)){n=d(n).parent().closest(\"span, td, th, legend\")}if(n.length===1){if(n.is(\".disabled\")){this.element.trigger({type:\"outOfRange\",date:this.viewDate,startDate:this.startDate,endDate:this.endDate});return}switch(n[0].nodeName.toLowerCase()){case\"th\":switch(n[0].className){case\"switch\":this.showMode(1);break;case\"prev\":case\"next\":var i=c.modes[this.viewMode].navStep*(n[0].className===\"prev\"?-1:1);switch(this.viewMode){case 0:this.viewDate=this.moveHour(this.viewDate,i);break;case 1:this.viewDate=this.moveDate(this.viewDate,i);break;case 2:this.viewDate=this.moveMonth(this.viewDate,i);break;case 3:case 4:this.viewDate=this.moveYear(this.viewDate,i);break}this.fill();this.element.trigger({type:n[0].className+\":\"+this.convertViewModeText(this.viewMode),date:this.viewDate,startDate:this.startDate,endDate:this.endDate});break;case\"clear\":this.reset();if(this.autoclose){this.hide()}break;case\"today\":var j=new Date();j=h(j.getFullYear(),j.getMonth(),j.getDate(),j.getHours(),j.getMinutes(),j.getSeconds(),0);if(j<this.startDate){j=this.startDate}else{if(j>this.endDate){j=this.endDate}}this.viewMode=this.startViewMode;this.showMode(0);this._setDate(j);this.fill();if(this.autoclose){this.hide()}break}break;case\"span\":if(!n.is(\".disabled\")){var p=this.viewDate.getUTCFullYear(),o=this.viewDate.getUTCMonth(),q=this.viewDate.getUTCDate(),r=this.viewDate.getUTCHours(),k=this.viewDate.getUTCMinutes(),s=this.viewDate.getUTCSeconds();if(n.is(\".month\")){this.viewDate.setUTCDate(1);o=n.parent().find(\"span\").index(n);q=this.viewDate.getUTCDate();this.viewDate.setUTCMonth(o);this.element.trigger({type:\"changeMonth\",date:this.viewDate});if(this.viewSelect>=3){this._setDate(h(p,o,q,r,k,s,0))}}else{if(n.is(\".year\")){this.viewDate.setUTCDate(1);p=parseInt(n.text(),10)||0;this.viewDate.setUTCFullYear(p);this.element.trigger({type:\"changeYear\",date:this.viewDate});if(this.viewSelect>=4){this._setDate(h(p,o,q,r,k,s,0))}}else{if(n.is(\".hour\")){r=parseInt(n.text(),10)||0;if(n.hasClass(\"hour_am\")||n.hasClass(\"hour_pm\")){if(r===12&&n.hasClass(\"hour_am\")){r=0}else{if(r!==12&&n.hasClass(\"hour_pm\")){r+=12}}}this.viewDate.setUTCHours(r);this.element.trigger({type:\"changeHour\",date:this.viewDate});if(this.viewSelect>=1){this._setDate(h(p,o,q,r,k,s,0))}}else{if(n.is(\".minute\")){k=parseInt(n.text().substr(n.text().indexOf(\":\")+1),10)||0;this.viewDate.setUTCMinutes(k);this.element.trigger({type:\"changeMinute\",date:this.viewDate});if(this.viewSelect>=0){this._setDate(h(p,o,q,r,k,s,0))}}}}}if(this.viewMode!==0){var l=this.viewMode;this.showMode(-1);this.fill();if(l===this.viewMode&&this.autoclose){this.hide()}}else{this.fill();if(this.autoclose){this.hide()}}}break;case\"td\":if(n.is(\".day\")&&!n.is(\".disabled\")){var q=parseInt(n.text(),10)||1;var p=this.viewDate.getUTCFullYear(),o=this.viewDate.getUTCMonth(),r=this.viewDate.getUTCHours(),k=this.viewDate.getUTCMinutes(),s=this.viewDate.getUTCSeconds();if(n.is(\".old\")){if(o===0){o=11;p-=1}else{o-=1}}else{if(n.is(\".new\")){if(o===11){o=0;p+=1}else{o+=1}}}this.viewDate.setUTCFullYear(p);this.viewDate.setUTCMonth(o,q);this.element.trigger({type:\"changeDay\",date:this.viewDate});if(this.viewSelect>=2){this._setDate(h(p,o,q,r,k,s,0))}}var l=this.viewMode;this.showMode(-1);this.fill();if(l===this.viewMode&&this.autoclose){this.hide()}break}}},_setDate:function(i,k){if(!k||k===\"date\"){this.date=i}if(!k||k===\"view\"){this.viewDate=i}this.fill();this.setValue();var j;if(this.isInput){j=this.element}else{if(this.component){j=this.element.find(\"input\")}}if(j){j.change()}this.element.trigger({type:\"changeDate\",date:this.getDate()});if(i===null){this.date=this.viewDate}},moveMinute:function(j,i){if(!i){return j}var k=new Date(j.valueOf());k.setUTCMinutes(k.getUTCMinutes()+(i*this.minuteStep));return k},moveHour:function(j,i){if(!i){return j}var k=new Date(j.valueOf());k.setUTCHours(k.getUTCHours()+i);return k},moveDate:function(j,i){if(!i){return j}var k=new Date(j.valueOf());k.setUTCDate(k.getUTCDate()+i);return k},moveMonth:function(j,k){if(!k){return j}var n=new Date(j.valueOf()),r=n.getUTCDate(),o=n.getUTCMonth(),m=Math.abs(k),q,p;k=k>0?1:-1;if(m===1){p=k===-1?function(){return n.getUTCMonth()===o}:function(){return n.getUTCMonth()!==q};q=o+k;n.setUTCMonth(q);if(q<0||q>11){q=(q+12)%12}}else{for(var l=0;l<m;l++){n=this.moveMonth(n,k)}q=n.getUTCMonth();n.setUTCDate(r);p=function(){return q!==n.getUTCMonth()}}while(p()){n.setUTCDate(--r);n.setUTCMonth(q)}return n},moveYear:function(j,i){return this.moveMonth(j,i*12)},dateWithinRange:function(i){return i>=this.startDate&&i<=this.endDate},keydown:function(o){if(this.picker.is(\":not(:visible)\")){if(o.keyCode===27){this.show()}return}var k=false,j,i,n;switch(o.keyCode){case 27:this.hide();o.preventDefault();break;case 37:case 39:if(!this.keyboardNavigation){break}j=o.keyCode===37?-1:1;var m=this.viewMode;if(o.ctrlKey){m+=2}else{if(o.shiftKey){m+=1}}if(m===4){i=this.moveYear(this.date,j);n=this.moveYear(this.viewDate,j)}else{if(m===3){i=this.moveMonth(this.date,j);n=this.moveMonth(this.viewDate,j)}else{if(m===2){i=this.moveDate(this.date,j);n=this.moveDate(this.viewDate,j)}else{if(m===1){i=this.moveHour(this.date,j);n=this.moveHour(this.viewDate,j)}else{if(m===0){i=this.moveMinute(this.date,j);n=this.moveMinute(this.viewDate,j)}}}}}if(this.dateWithinRange(i)){this.date=i;this.viewDate=n;this.setValue();this.update();o.preventDefault();k=true}break;case 38:case 40:if(!this.keyboardNavigation){break}j=o.keyCode===38?-1:1;m=this.viewMode;if(o.ctrlKey){m+=2}else{if(o.shiftKey){m+=1}}if(m===4){i=this.moveYear(this.date,j);n=this.moveYear(this.viewDate,j)}else{if(m===3){i=this.moveMonth(this.date,j);n=this.moveMonth(this.viewDate,j)}else{if(m===2){i=this.moveDate(this.date,j*7);n=this.moveDate(this.viewDate,j*7)}else{if(m===1){if(this.showMeridian){i=this.moveHour(this.date,j*6);n=this.moveHour(this.viewDate,j*6)}else{i=this.moveHour(this.date,j*4);n=this.moveHour(this.viewDate,j*4)}}else{if(m===0){i=this.moveMinute(this.date,j*4);n=this.moveMinute(this.viewDate,j*4)}}}}}if(this.dateWithinRange(i)){this.date=i;this.viewDate=n;this.setValue();this.update();o.preventDefault();k=true}break;case 13:if(this.viewMode!==0){var p=this.viewMode;this.showMode(-1);this.fill();if(p===this.viewMode&&this.autoclose){this.hide()}}else{this.fill();if(this.autoclose){this.hide()}}o.preventDefault();break;case 9:this.hide();break}if(k){var l;if(this.isInput){l=this.element}else{if(this.component){l=this.element.find(\"input\")}}if(l){l.change()}this.element.trigger({type:\"changeDate\",date:this.getDate()})}},showMode:function(i){if(i){var j=Math.max(0,Math.min(c.modes.length-1,this.viewMode+i));if(j>=this.minView&&j<=this.maxView){this.element.trigger({type:\"changeMode\",date:this.viewDate,oldViewMode:this.viewMode,newViewMode:j});this.viewMode=j}}this.picker.find(\">div\").hide().filter(\".datetimepicker-\"+c.modes[this.viewMode].clsName).css(\"display\",\"block\");this.updateNavArrows()},reset:function(){this._setDate(null,\"date\")},convertViewModeText:function(i){switch(i){case 4:return\"decade\";case 3:return\"year\";case 2:return\"month\";case 1:return\"day\";case 0:return\"hour\"}}};var b=d.fn.datetimepicker;d.fn.datetimepicker=function(k){var i=Array.apply(null,arguments);i.shift();var j;this.each(function(){var n=d(this),m=n.data(\"datetimepicker\"),l=typeof k===\"object\"&&k;if(!m){n.data(\"datetimepicker\",(m=new g(this,d.extend({},d.fn.datetimepicker.defaults,l))))}if(typeof k===\"string\"&&typeof m[k]===\"function\"){j=m[k].apply(m,i);if(j!==f){return false}}});if(j!==f){return j}else{return this}};d.fn.datetimepicker.defaults={};d.fn.datetimepicker.Constructor=g;var e=d.fn.datetimepicker.dates={en:{days:[\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],daysShort:[\"Sun\",\"Mon\",\"Tue\",\"Wed\",\"Thu\",\"Fri\",\"Sat\",\"Sun\"],daysMin:[\"Su\",\"Mo\",\"Tu\",\"We\",\"Th\",\"Fr\",\"Sa\",\"Su\"],months:[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],monthsShort:[\"Jan\",\"Feb\",\"Mar\",\"Apr\",\"May\",\"Jun\",\"Jul\",\"Aug\",\"Sep\",\"Oct\",\"Nov\",\"Dec\"],meridiem:[\"am\",\"pm\"],suffix:[\"st\",\"nd\",\"rd\",\"th\"],today:\"Today\",clear:\"Clear\"}};var c={modes:[{clsName:\"minutes\",navFnc:\"Hours\",navStep:1},{clsName:\"hours\",navFnc:\"Date\",navStep:1},{clsName:\"days\",navFnc:\"Month\",navStep:1},{clsName:\"months\",navFnc:\"FullYear\",navStep:1},{clsName:\"years\",navFnc:\"FullYear\",navStep:10}],isLeapYear:function(i){return(((i%4===0)&&(i%100!==0))||(i%400===0))},getDaysInMonth:function(i,j){return[31,(c.isLeapYear(i)?29:28),31,30,31,30,31,31,30,31,30,31][j]},getDefaultFormat:function(i,j){if(i===\"standard\"){if(j===\"input\"){return\"yyyy-mm-dd hh:ii\"}else{return\"yyyy-mm-dd hh:ii:ss\"}}else{if(i===\"php\"){if(j===\"input\"){return\"Y-m-d H:i\"}else{return\"Y-m-d H:i:s\"}}else{throw new Error(\"Invalid format type.\")}}},validParts:function(i){if(i===\"standard\"){return/t|hh?|HH?|p|P|z|Z|ii?|ss?|dd?|DD?|mm?|MM?|yy(?:yy)?/g}else{if(i===\"php\"){return/[dDjlNwzFmMnStyYaABgGhHis]/g}else{throw new Error(\"Invalid format type.\")}}},nonpunctuation:/[^ -\\/:-@\\[-`{-~\\t\\n\\rTZ]+/g,parseFormat:function(l,j){var i=l.replace(this.validParts(j),\"\\0\").split(\"\\0\"),k=l.match(this.validParts(j));if(!i||!i.length||!k||k.length===0){throw new Error(\"Invalid date format.\")}return{separators:i,parts:k}},parseDate:function(A,y,v,j,r){if(A instanceof Date){var u=new Date(A.valueOf()-A.getTimezoneOffset()*60000);u.setMilliseconds(0);return u}if(/^\\d{4}\\-\\d{1,2}\\-\\d{1,2}$/.test(A)){y=this.parseFormat(\"yyyy-mm-dd\",j)}if(/^\\d{4}\\-\\d{1,2}\\-\\d{1,2}[T ]\\d{1,2}\\:\\d{1,2}$/.test(A)){y=this.parseFormat(\"yyyy-mm-dd hh:ii\",j)}if(/^\\d{4}\\-\\d{1,2}\\-\\d{1,2}[T ]\\d{1,2}\\:\\d{1,2}\\:\\d{1,2}[Z]{0,1}$/.test(A)){y=this.parseFormat(\"yyyy-mm-dd hh:ii:ss\",j)}if(/^[-+]\\d+[dmwy]([\\s,]+[-+]\\d+[dmwy])*$/.test(A)){var l=/([-+]\\d+)([dmwy])/,q=A.match(/([-+]\\d+)([dmwy])/g),t,p;A=new Date();for(var x=0");
                builder.append(";x<q.length;x++){t=l.exec(q[x]);p=parseInt(t[1]);switch(t[2]){case\"d\":A.setUTCDate(A.getUTCDate()+p);break;case\"m\":A=g.prototype.moveMonth.call(g.prototype,A,p);break;case\"w\":A.setUTCDate(A.getUTCDate()+p*7);break;case\"y\":A=g.prototype.moveYear.call(g.prototype,A,p);break}}return h(A.getUTCFullYear(),A.getUTCMonth(),A.getUTCDate(),A.getUTCHours(),A.getUTCMinutes(),A.getUTCSeconds(),0)}var q=A&&A.toString().match(this.nonpunctuation)||[],A=new Date(0,0,0,0,0,0,0),m={},z=[\"hh\",\"h\",\"ii\",\"i\",\"ss\",\"s\",\"yyyy\",\"yy\",\"M\",\"MM\",\"m\",\"mm\",\"D\",\"DD\",\"d\",\"dd\",\"H\",\"HH\",\"p\",\"P\",\"z\",\"Z\"],o={hh:function(s,i){return s.setUTCHours(i)},h:function(s,i){return s.setUTCHours(i)},HH:function(s,i){return s.setUTCHours(i===12?0:i)},H:function(s,i){return s.setUTCHours(i===12?0:i)},ii:function(s,i){return s.setUTCMinutes(i)},i:function(s,i){return s.setUTCMinutes(i)},ss:function(s,i){return s.setUTCSeconds(i)},s:function(s,i){return s.setUTCSeconds(i)},yyyy:function(s,i){return s.setUTCFullYear(i)},yy:function(s,i){return s.setUTCFullYear(2000+i)},m:function(s,i){i-=1;while(i<0){i+=12}i%=12;s.setUTCMonth(i);while(s.getUTCMonth()!==i){if(isNaN(s.getUTCMonth())){return s}else{s.setUTCDate(s.getUTCDate()-1)}}return s},d:function(s,i){return s.setUTCDate(i)},p:function(s,i){return s.setUTCHours(i===1?s.getUTCHours()+12:s.getUTCHours())},z:function(){return r}},B,k,t;o.M=o.MM=o.mm=o.m;o.dd=o.d;o.P=o.p;o.Z=o.z;A=h(A.getFullYear(),A.getMonth(),A.getDate(),A.getHours(),A.getMinutes(),A.getSeconds());if(q.length===y.parts.length){for(var x=0,w=y.parts.length;x<w;x++){B=parseInt(q[x],10);t=y.parts[x];if(isNaN(B)){switch(t){case\"MM\":k=d(e[v].months).filter(function(){var i=this.slice(0,q[x].length),s=q[x].slice(0,i.length);return i===s});B=d.inArray(k[0],e[v].months)+1;break;case\"M\":k=d(e[v].monthsShort).filter(function(){var i=this.slice(0,q[x].length),s=q[x].slice(0,i.length);return i.toLowerCase()===s.toLowerCase()});B=d.inArray(k[0],e[v].monthsShort)+1;break;case\"p\":case\"P\":B=d.inArray(q[x].toLowerCase(),e[v].meridiem);break;case\"z\":case\"Z\":r;break}}m[t]=B}for(var x=0,n;x<z.length;x++){n=z[x];if(n in m&&!isNaN(m[n])){o[n](A,m[n])}}}return A},formatDate:function(l,q,m,p,o){if(l===null){return\"\"}var k;if(p===\"standard\"){k={t:l.getTime(),yy:l.getUTCFullYear().toString().substring(2),yyyy:l.getUTCFullYear(),m:l.getUTCMonth()+1,M:e[m].monthsShort[l.getUTCMonth()],MM:e[m].months[l.getUTCMonth()],d:l.getUTCDate(),D:e[m].daysShort[l.getUTCDay()],DD:e[m].days[l.getUTCDay()],p:(e[m].meridiem.length===2?e[m].meridiem[l.getUTCHours()<12?0:1]:\"\"),h:l.getUTCHours(),i:l.getUTCMinutes(),s:l.getUTCSeconds(),z:o};if(e[m].meridiem.length===2){k.H=(k.h%12===0?12:k.h%12)}else{k.H=k.h}k.HH=(k.H<10?\"0\":\"\")+k.H;k.P=k.p.toUpperCase();k.Z=k.z;k.hh=(k.h<10?\"0\":\"\")+k.h;k.ii=(k.i<10?\"0\":\"\")+k.i;k.ss=(k.s<10?\"0\":\"\")+k.s;k.dd=(k.d<10?\"0\":\"\")+k.d;k.mm=(k.m<10?\"0\":\"\")+k.m}else{if(p===\"php\"){k={y:l.getUTCFullYear().toString().substring(2),Y:l.getUTCFullYear(),F:e[m].months[l.getUTCMonth()],M:e[m].monthsShort[l.getUTCMonth()],n:l.getUTCMonth()+1,t:c.getDaysInMonth(l.getUTCFullYear(),l.getUTCMonth()),j:l.getUTCDate(),l:e[m].days[l.getUTCDay()],D:e[m].daysShort[l.getUTCDay()],w:l.getUTCDay(),N:(l.getUTCDay()===0?7:l.getUTCDay()),S:(l.getUTCDate()%10<=e[m].suffix.length?e[m].suffix[l.getUTCDate()%10-1]:\"\"),a:(e[m].meridiem.length===2?e[m].meridiem[l.getUTCHours()<12?0:1]:\"\"),g:(l.getUTCHours()%12===0?12:l.getUTCHours()%12),G:l.getUTCHours(),i:l.getUTCMinutes(),s:l.getUTCSeconds()};k.m=(k.n<10?\"0\":\"\")+k.n;k.d=(k.j<10?\"0\":\"\")+k.j;k.A=k.a.toString().toUpperCase();k.h=(k.g<10?\"0\":\"\")+k.g;k.H=(k.G<10?\"0\":\"\")+k.G;k.i=(k.i<10?\"0\":\"\")+k.i;k.s=(k.s<10?\"0\":\"\")+k.s}else{throw new Error(\"Invalid format type.\")}}var l=[],r=d.extend([],q.separators);for(var n=0,j=q.parts.length;n<j;n++){if(r.length){l.push(r.shift())}l.push(k[q.parts[n]])}if(r.length){l.push(r.shift())}return l.join(\"\")},convertViewMode:function(i){switch(i){case 4:case\"decade\":i=4;break;case 3:case\"year\":i=3;break;case 2:case\"month\":i=2;break;case 1:case\"day\":i=1;break;case 0:case\"hour\":i=0;break}return i},headTemplate:'<thead><tr><th class=\"prev\"><i class=\"{iconType} {leftArrow}\"/></th><th colspan=\"5\" class=\"switch\"></th><th class=\"next\"><i class=\"{iconType} {rightArrow}\"/></th></tr></thead>',headTemplateV3:'<thead><tr><th class=\"prev\"><span class=\"{iconType} {leftArrow}\"></span> </th><th colspan=\"5\" class=\"switch\"></th><th class=\"next\"><span class=\"{iconType} {rightArrow}\"></span> </th></tr></thead>',contTemplate:'<tbody><tr><td colspan=\"7\"></td></tr></tbody>',footTemplate:'<tfoot><tr><th colspan=\"7\" class=\"today\"></th></tr><tr><th colspan=\"7\" class=\"clear\"></th></tr></tfoot>'};c.template='<div class=\"datetimepicker\"><div class=\"datetimepicker-minutes\"><table class=\" table-condensed\">'+c.headTemplate+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-hours\"><table class=\" table-condensed\">'+c.headTemplate+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-days\"><table class=\" table-condensed\">'+c.headTemplate+\"<tbody></tbody>\"+c.footTemplate+'</table></div><div class=\"datetimepicker-months\"><table class=\"table-condensed\">'+c.headTemplate+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-years\"><table class=\"table-condensed\">'+c.headTemplate+c.contTemplate+c.footTemplate+\"</table></div></div>\";c.templateV3='<div class=\"datetimepicker\"><div class=\"datetimepicker-minutes\"><table class=\" table-condensed\">'+c.headTemplateV3+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-hours\"><table class=\" table-condensed\">'+c.headTemplateV3+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-days\"><table class=\" table-condensed\">'+c.headTemplateV3+\"<tbody></tbody>\"+c.footTemplate+'</table></div><div class=\"datetimepicker-months\"><table class=\"table-condensed\">'+c.headTemplateV3+c.contTemplate+c.footTemplate+'</table></div><div class=\"datetimepicker-years\"><table class=\"table-condensed\">'+c.headTemplateV3+c.contTemplate+c.footTemplate+\"</table></div></div>\";d.fn.datetimepicker.DPGlobal=c;d.fn.datetimepicker.noConflict=function(){d.fn.datetimepicker=b;return this};d(document).on(\"focus.datetimepicker.data-api click.datetimepicker.data-api\",'[data-provide=\"datetimepicker\"]',function(j){var i=d(this);if(i.data(\"datetimepicker\")){return}j.preventDefault();i.datetimepicker(\"show\")});d(function(){d('[data-provide=\"datetimepicker-inline\"]').datetimepicker()})}));");
                return builder.toString();
            }

            public String getName() {
                return "dateTimePicker";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource dateTimePicker() {
        return dateTimePickerInitializer.get();
    }

    private void arInitializer() {
        ar = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ar.js
            public String getText() {
                return "/**\n* Arabic translation for bootstrap-datetimepicker\n* Ala' Mohammad <amohammad@birzeit.ecu>\n*/\n;(function($){\n$.fn.datetimepicker.dates['ar'] = {\ndays: [\"الأحد\", \"الاثنين\", \"الثلاثاء\", \"الأربعاء\", \"الخميس\", \"الجمعة\", \"السبت\", \"الأحد\"],\ndaysShort: [\"أحد\", \"اثنين\", \"ثلاثاء\", \"أربعاء\", \"خميس\", \"جمعة\", \"سبت\", \"أحد\"],\ndaysMin: [\"أح\", \"إث\", \"ث\", \"أر\", \"خ\", \"ج\", \"س\", \"أح\"],\nmonths: [\"يناير\", \"فبراير\", \"مارس\", \"أبريل\", \"مايو\", \"يونيو\", \"يوليو\", \"أغسطس\", \"سبتمبر\", \"أكتوبر\", \"نوفمبر\", \"ديسمبر\"],\nmonthsShort: [\"يناير\", \"فبراير\", \"مارس\", \"أبريل\", \"مايو\", \"يونيو\", \"يوليو\", \"أغسطس\", \"سبتمبر\", \"أكتوبر\", \"نوفمبر\", \"ديسمبر\"],\ntoday: \"هذا اليوم\",\nsuffix: [],\nmeridiem: [],\nrtl: true\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ar";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ar() {
        return arInitializer.get();
    }

    private void azInitializer() {
        az = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.az.js
            public String getText() {
                return "/**\n * Azerbaijani translation for bootstrap-datetimepicker\n * Konstantin Kaluzhnikov <k.kaluzhnikov@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['az'] = {\ndays: [\"Bazar\", \"Bazar ertəsi\", \"Çərşənbə axşamı\", \"Çərşənbə\", \"Cümə axşamı\", \"Cümə\", \"Şənbə\", \"Bazar\"],\ndaysShort: [\"B\", \"Be\", \"Ça\", \"Ç\", \"Ca\", \"C\", \"Ş\", \"B\"],\ndaysMin: [\"B\", \"Be\", \"Ça\", \"Ç\", \"Ca\", \"C\", \"Ş\", \"B\"],\nmonths: [\"Yanvar\", \"Fevral\", \"Mart\", \"Aprel\", \"May\", \"İyun\", \"İyul\", \"Avqust\", \"Sentyabr\", \"Oktyabr\", \"Noyabr\", \"Dekabr\"],\nmonthsShort: [\"Yan\", \"Fev\", \"Mar\", \"Apr\", \"May\", \"İyun\", \"İyul\", \"Avq\", \"Sen\", \"Okt\", \"Noy\", \"Dek\"],\ntoday: \"Bugün\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "az";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource az() {
        return azInitializer.get();
    }

    private void bgInitializer() {
        bg = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.bg.js
            public String getText() {
                return "/**\n * Bulgarian translation for bootstrap-datetimepicker\n * Apostol Apostolov <apostol.s.apostolov@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['bg'] = {\ndays: [\"Неделя\", \"Понеделник\", \"Вторник\", \"Сряда\", \"Четвъртък\", \"Петък\", \"Събота\", \"Неделя\"],\ndaysShort: [\"Нед\", \"Пон\", \"Вто\", \"Сря\", \"Чет\", \"Пет\", \"Съб\", \"Нед\"],\ndaysMin: [\"Н\", \"П\", \"В\", \"С\", \"Ч\", \"П\", \"С\", \"Н\"],\nmonths: [\"Януари\", \"Февруари\", \"Март\", \"Април\", \"Май\", \"Юни\", \"Юли\", \"Август\", \"Септември\", \"Октомври\", \"Ноември\", \"Декември\"],\nmonthsShort: [\"Ян\", \"Фев\", \"Мар\", \"Апр\", \"Май\", \"Юни\", \"Юли\", \"Авг\", \"Сеп\", \"Окт\", \"Ное\", \"Дек\"],\ntoday: \"днес\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "bg";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource bg() {
        return bgInitializer.get();
    }

    private void bnInitializer() {
        bn = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.bn.js
            public String getText() {
                return "/**\n * Bangla(Bangladesh) translation for bootstrap-datetimepicker\n * Mahbub Rabbani <mahbub [dot] rucse [at] gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['bn'] = {\ndays: [\"রবিবার\", \"সোমবার\", \"মঙ্গলবার\", \"বুধবার\", \"বৃহষ্পতিবার\", \"শুক্রবার\", \"শনিবার\", \"রবিবার\"],\ndaysShort: [\"রবি\", \"সোম\", \"মঙ্গল\", \"বুধ\", \"  বৃহঃ\", \"শুক্র\", \"শনি\", \"রবি\"],\ndaysMin: [\"রবি\", \"সোম\", \"মঙ্গ\", \"বুধ\", \"বৃহ\", \"শুক্র\", \"শনি\", \"রবি\"],\nmonths: ['জানুয়ারী', 'ফেব্রুয়ারী', 'মার্চ', 'এপ্রিল', 'মে', 'জুন', 'জুলাই', 'অগাস্ট', 'সেপ্টেম্বর', 'অক্টোবর', 'নভেম্বর', 'ডিসেম্বর' ],\nmonthsShort: ['জানু', 'ফেব্রু', 'মার্চ', 'এপ্রি', 'মে', 'জুন', 'জুলা', 'অগা', 'সেপ্টে', 'অক্টো', 'নভে', 'ডিসে' ],\ntoday: \"আজ\",\nsuffix: [],\nmeridiem: ['পূর্বাহ্ণ', 'অপরাহ্ন']\n};\n}(jQuery));";
            }

            public String getName() {
                return "bn";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource bn() {
        return bnInitializer.get();
    }

    private void caInitializer() {
        ca = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ca.js
            public String getText() {
                return "/**\n * Catalan translation for bootstrap-datetimepicker\n * J. Garcia <jogaco.en@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['ca'] = {\ndays: [\"Diumenge\", \"Dilluns\", \"Dimarts\", \"Dimecres\", \"Dijous\", \"Divendres\", \"Dissabte\", \"Diumenge\"],\ndaysShort: [\"Diu\",  \"Dil\", \"Dmt\", \"Dmc\", \"Dij\", \"Div\", \"Dis\", \"Diu\"],\ndaysMin: [\"dg\", \"dl\", \"dt\", \"dc\", \"dj\", \"dv\", \"ds\", \"dg\"],\nmonths: [\"Gener\", \"Febrer\", \"Març\", \"Abril\", \"Maig\", \"Juny\", \"Juliol\", \"Agost\", \"Setembre\", \"Octubre\", \"Novembre\", \"Desembre\"],\nmonthsShort: [\"Gen\", \"Feb\", \"Mar\", \"Abr\", \"Mai\", \"Jun\", \"Jul\", \"Ago\", \"Set\", \"Oct\", \"Nov\", \"Des\"],\ntoday: \"Avui\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ca";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ca() {
        return caInitializer.get();
    }

    private void csInitializer() {
        cs = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.cs.js
            public String getText() {
                return "/**\n * Czech translation for bootstrap-datetimepicker\n * Matěj Koubík <matej@koubik.name>\n * Fixes by Michal Remiš <michal.remis@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['cs'] = {\ndays: [\"Neděle\", \"Pondělí\", \"Úterý\", \"Středa\", \"Čtvrtek\", \"Pátek\", \"Sobota\", \"Neděle\"],\ndaysShort: [\"Ned\", \"Pon\", \"Úte\", \"Stř\", \"Čtv\", \"Pát\", \"Sob\", \"Ned\"],\ndaysMin: [\"Ne\", \"Po\", \"Út\", \"St\", \"Čt\", \"Pá\", \"So\", \"Ne\"],\nmonths: [\"Leden\", \"Únor\", \"Březen\", \"Duben\", \"Květen\", \"Červen\", \"Červenec\", \"Srpen\", \"Září\", \"Říjen\", \"Listopad\", \"Prosinec\"],\nmonthsShort: [\"Led\", \"Úno\", \"Bře\", \"Dub\", \"Kvě\", \"Čer\", \"Čnc\", \"Srp\", \"Zář\", \"Říj\", \"Lis\", \"Pro\"],\ntoday: \"Dnes\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd.mm.yyyy\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "cs";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource cs() {
        return csInitializer.get();
    }

    private void daInitializer() {
        da = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.da.js
            public String getText() {
                return "/**\n * Danish translation for bootstrap-datetimepicker\n * Christian Pedersen <http://github.com/chripede>\n */\n;(function($){\n$.fn.datetimepicker.dates['da'] = {\ndays: [\"Søndag\", \"Mandag\", \"Tirsdag\", \"Onsdag\", \"Torsdag\", \"Fredag\", \"Lørdag\", \"Søndag\"],\ndaysShort: [\"Søn\", \"Man\", \"Tir\", \"Ons\", \"Tor\", \"Fre\", \"Lør\", \"Søn\"],\ndaysMin: [\"Sø\", \"Ma\", \"Ti\", \"On\", \"To\", \"Fr\", \"Lø\", \"Sø\"],\nmonths: [\"Januar\", \"Februar\", \"Marts\", \"April\", \"Maj\", \"Juni\", \"Juli\", \"August\", \"September\", \"Oktober\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Maj\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"I Dag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));";
            }

            public String getName() {
                return "da";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource da() {
        return daInitializer.get();
    }

    private void deInitializer() {
        de = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.de.js
            public String getText() {
                return "/**\n * German translation for bootstrap-datetimepicker\n * Sam Zurcher <sam@orelias.ch>\n */\n;(function($){\n$.fn.datetimepicker.dates['de'] = {\ndays: [\"Sonntag\", \"Montag\", \"Dienstag\", \"Mittwoch\", \"Donnerstag\", \"Freitag\", \"Samstag\", \"Sonntag\"],\ndaysShort: [\"Son\", \"Mon\", \"Die\", \"Mit\", \"Don\", \"Fre\", \"Sam\", \"Son\"],\ndaysMin: [\"So\", \"Mo\", \"Di\", \"Mi\", \"Do\", \"Fr\", \"Sa\", \"So\"],\nmonths: [\"Januar\", \"Februar\", \"März\", \"April\", \"Mai\", \"Juni\", \"Juli\", \"August\", \"September\", \"Oktober\", \"November\", \"Dezember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mär\", \"Apr\", \"Mai\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dez\"],\ntoday: \"Heute\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd.mm.yyyy\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "de";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource de() {
        return deInitializer.get();
    }

    private void eeInitializer() {
        ee = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ee.js
            public String getText() {
                return "/**\n * Estonian translation for bootstrap-datetimepicker\n * Rene Korss <http://rene.korss.ee> \n */\n;(function($){\n$.fn.datetimepicker.dates['ee'] = {\ndays:        [\"Pühapäev\", \"Esmaspäev\", \"Teisipäev\", \"Kolmapäev\", \"Neljapäev\", \"Reede\", \"Laupäev\", \"Pühapäev\"],\ndaysShort:   [\"P\", \"E\", \"T\", \"K\", \"N\", \"R\", \"L\", \"P\"],\ndaysMin:     [\"P\", \"E\", \"T\", \"K\", \"N\", \"R\", \"L\", \"P\"],\nmonths:      [\"Jaanuar\", \"Veebruar\", \"Märts\", \"Aprill\", \"Mai\", \"Juuni\", \"Juuli\", \"August\", \"September\", \"Oktoober\", \"November\", \"Detsember\"],\nmonthsShort: [\"Jaan\", \"Veebr\", \"Märts\", \"Apr\", \"Mai\", \"Juuni\", \"Juuli\", \"Aug\", \"Sept\", \"Okt\", \"Nov\", \"Dets\"],\ntoday:       \"Täna\",\nsuffix:     [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd.mm.yyyy hh:ii\"\n};\n}(jQuery));";
            }

            public String getName() {
                return "ee";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ee() {
        return eeInitializer.get();
    }

    private void elInitializer() {
        el = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.el.js
            public String getText() {
                return "/**\n* Greek translation for bootstrap-datetimepicker\n*/\n;(function($){\n  $.fn.datetimepicker.dates['el'] = {\n    days: [\"Κυριακή\", \"Δευτέρα\", \"Τρίτη\", \"Τετάρτη\", \"Πέμπτη\", \"Παρασκευή\", \"Σάββατο\", \"Κυριακή\"],\n    daysShort: [\"Κυρ\", \"Δευ\", \"Τρι\", \"Τετ\", \"Πεμ\", \"Παρ\", \"Σαβ\", \"Κυρ\"],\n    daysMin: [\"Κυ\", \"Δε\", \"Τρ\", \"Τε\", \"Πε\", \"Πα\", \"Σα\", \"Κυ\"],\n    months: [\"Ιανουάριος\", \"Φεβρουάριος\", \"Μάρτιος\", \"Απρίλιος\", \"Μάιος\", \"Ιούνιος\", \"Ιούλιος\", \"Αύγουστος\", \"Σεπτέμβριος\", \"Οκτώβριος\", \"Νοέμβριος\", \"Δεκέμβριος\"],\n    monthsShort: [\"Ιαν\", \"Φεβ\", \"Μαρ\", \"Απρ\", \"Μάι\", \"Ιουν\", \"Ιουλ\", \"Αυγ\", \"Σεπ\", \"Οκτ\", \"Νοε\", \"Δεκ\"],\n    today: \"Σήμερα\",\nsuffix: [],\nmeridiem: []\n  };\n}(jQuery));";
            }

            public String getName() {
                return "el";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource el() {
        return elInitializer.get();
    }

    private void esInitializer() {
        es = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.es.js
            public String getText() {
                return "/**\n * Spanish translation for bootstrap-datetimepicker\n * Bruno Bonamin <bruno.bonamin@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['es'] = {\ndays: [\"Domingo\", \"Lunes\", \"Martes\", \"Miércoles\", \"Jueves\", \"Viernes\", \"Sábado\", \"Domingo\"],\ndaysShort: [\"Dom\", \"Lun\", \"Mar\", \"Mié\", \"Jue\", \"Vie\", \"Sáb\", \"Dom\"],\ndaysMin: [\"Do\", \"Lu\", \"Ma\", \"Mi\", \"Ju\", \"Vi\", \"Sa\", \"Do\"],\nmonths: [\"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\", \"Julio\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\", \"Diciembre\"],\nmonthsShort: [\"Ene\", \"Feb\", \"Mar\", \"Abr\", \"May\", \"Jun\", \"Jul\", \"Ago\", \"Sep\", \"Oct\", \"Nov\", \"Dic\"],\ntoday: \"Hoy\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "es";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource es() {
        return esInitializer.get();
    }

    private void fiInitializer() {
        fi = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.fi.js
            public String getText() {
                return "/**\n * Finnish translation for bootstrap-datetimepicker\n * Jaakko Salonen <https://github.com/jsalonen>\n */\n;(function($){\n$.fn.datetimepicker.dates['fi'] = {\ndays: [\"sunnuntai\", \"maanantai\", \"tiistai\", \"keskiviikko\", \"torstai\", \"perjantai\", \"lauantai\", \"sunnuntai\"],\ndaysShort: [\"sun\", \"maa\", \"tii\", \"kes\", \"tor\", \"per\", \"lau\", \"sun\"],\ndaysMin: [\"su\", \"ma\", \"ti\", \"ke\", \"to\", \"pe\", \"la\", \"su\"],\nmonths: [\"tammikuu\", \"helmikuu\", \"maaliskuu\", \"huhtikuu\", \"toukokuu\", \"kesäkuu\", \"heinäkuu\", \"elokuu\", \"syyskuu\", \"lokakuu\", \"marraskuu\", \"joulukuu\"],\nmonthsShort: [\"tam\", \"hel\", \"maa\", \"huh\", \"tou\", \"kes\", \"hei\", \"elo\", \"syy\", \"lok\", \"mar\", \"jou\"],\ntoday: \"tänään\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "fi";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource fi() {
        return fiInitializer.get();
    }

    private void frInitializer() {
        fr = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.fr.js
            public String getText() {
                return "/**\n * French translation for bootstrap-datetimepicker\n * Nico Mollet <nico.mollet@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['fr'] = {\ndays: [\"Dimanche\", \"Lundi\", \"Mardi\", \"Mercredi\", \"Jeudi\", \"Vendredi\", \"Samedi\", \"Dimanche\"],\ndaysShort: [\"Dim\", \"Lun\", \"Mar\", \"Mer\", \"Jeu\", \"Ven\", \"Sam\", \"Dim\"],\ndaysMin: [\"D\", \"L\", \"Ma\", \"Me\", \"J\", \"V\", \"S\", \"D\"],\nmonths: [\"Janvier\", \"Février\", \"Mars\", \"Avril\", \"Mai\", \"Juin\", \"Juillet\", \"Août\", \"Septembre\", \"Octobre\", \"Novembre\", \"Décembre\"],\nmonthsShort: [\"Jan\", \"Fev\", \"Mar\", \"Avr\", \"Mai\", \"Jui\", \"Jul\", \"Aou\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"],\ntoday: \"Aujourd'hui\",\nsuffix: [],\nmeridiem: [\"am\", \"pm\"],\nweekStart: 1,\nformat: \"dd/mm/yyyy hh:ii\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "fr";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource fr() {
        return frInitializer.get();
    }

    private void heInitializer() {
        he = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.he.js
            public String getText() {
                return "/**\n * Hebrew translation for bootstrap-datetimepicker\n * Sagie Maoz <sagie@maoz.info>\n */\n;(function($){\n  $.fn.datetimepicker.dates['he'] = {\n      days: [\"ראשון\", \"שני\", \"שלישי\", \"רביעי\", \"חמישי\", \"שישי\", \"שבת\", \"ראשון\"],\n      daysShort: [\"א\", \"ב\", \"ג\", \"ד\", \"ה\", \"ו\", \"ש\", \"א\"],\n      daysMin: [\"א\", \"ב\", \"ג\", \"ד\", \"ה\", \"ו\", \"ש\", \"א\"],\n      months: [\"ינואר\", \"פברואר\", \"מרץ\", \"אפריל\", \"מאי\", \"יוני\", \"יולי\", \"אוגוסט\", \"ספטמבר\", \"אוקטובר\", \"נובמבר\", \"דצמבר\"],\n      monthsShort: [\"ינו\", \"פבר\", \"מרץ\", \"אפר\", \"מאי\", \"יונ\", \"יול\", \"אוג\", \"ספט\", \"אוק\", \"נוב\", \"דצמ\"],\n      today: \"היום\",\n  suffix: [],\n  meridiem: [],\n      rtl: true\n  };\n}(jQuery));\n";
            }

            public String getName() {
                return "he";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource he() {
        return heInitializer.get();
    }

    private void hrInitializer() {
        hr = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.hr.js
            public String getText() {
                return "/**\n * Croatian localisation\n */\n;(function($){\n$.fn.datetimepicker.dates['hr'] = {\ndays: [\"Nedjelja\", \"Ponedjelja\", \"Utorak\", \"Srijeda\", \"Četrtak\", \"Petak\", \"Subota\", \"Nedjelja\"],\ndaysShort: [\"Ned\", \"Pon\", \"Uto\", \"Srr\", \"Čet\", \"Pet\", \"Sub\", \"Ned\"],\ndaysMin: [\"Ne\", \"Po\", \"Ut\", \"Sr\", \"Če\", \"Pe\", \"Su\", \"Ne\"],\nmonths: [\"Siječanj\", \"Veljača\", \"Ožujak\", \"Travanj\", \"Svibanj\", \"Lipanj\", \"Srpanj\", \"Kolovoz\", \"Rujan\", \"Listopad\", \"Studeni\", \"Prosinac\"],\nmonthsShort: [\"Sije\", \"Velj\", \"Ožu\", \"Tra\", \"Svi\", \"Lip\", \"Jul\", \"Kol\", \"Ruj\", \"Lis\", \"Stu\", \"Pro\"],\ntoday: \"Danas\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "hr";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource hr() {
        return hrInitializer.get();
    }

    private void huInitializer() {
        hu = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.hu.js
            public String getText() {
                return "/**\n * Hungarian translation for bootstrap-datetimepicker\n * darevish <http://github.com/darevish>\n */\n;(function($){\n$.fn.datetimepicker.dates['hu'] = {\ndays: [\"Vasárnap\", \"Hétfő\", \"Kedd\", \"Szerda\", \"Csütörtök\", \"Péntek\", \"Szombat\", \"Vasárnap\"],\ndaysShort: [\"Vas\", \"Hét\", \"Ked\", \"Sze\", \"Csü\", \"Pén\", \"Szo\", \"Vas\"],\ndaysMin: [\"V\", \"H\", \"K\", \"Sze\", \"Cs\", \"P\", \"Szo\", \"V\"],\nmonths: [\"Január\", \"Február\", \"Március\", \"Április\", \"Május\", \"Június\", \"Július\", \"Augusztus\", \"Szeptember\", \"Október\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Már\", \"Ápr\", \"Máj\", \"Jún\", \"Júl\", \"Aug\", \"Sze\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"Ma\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "hu";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource hu() {
        return huInitializer.get();
    }

    private void idInitializer() {
        id = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.id.js
            public String getText() {
                return "/**\n * Bahasa translation for bootstrap-datetimepicker\n * Azwar Akbar <azwar.akbar@gmail.com>\n * Addtional by Yulian Sutopo <yuliansutopo@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['id'] = {\ndays: [\"Minggu\", \"Senin\", \"Selasa\", \"Rabu\", \"Kamis\", \"Jumat\", \"Sabtu\", \"Minggu\"],\ndaysShort: [\"Mng\", \"Sen\", \"Sel\", \"Rab\", \"Kam\", \"Jum\", \"Sab\", \"Mng\"],\ndaysMin: [\"Mg\", \"Sn\", \"Sl\", \"Ra\", \"Ka\", \"Ju\", \"Sa\", \"Mg\"],\nmonths: [\"Januari\", \"Februari\", \"Maret\", \"April\", \"Mei\", \"Juni\", \"Juli\", \"Agustus\", \"September\", \"Oktober\", \"November\", \"Desember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Mei\", \"Jun\", \"Jul\", \"Ags\", \"Sep\", \"Okt\", \"Nov\", \"Des\"],\ntoday: \"Hari Ini\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd/mm/yyyy hh:ii:ss\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "id";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource id() {
        return idInitializer.get();
    }

    private void isInitializer() {
        is = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.is.js
            public String getText() {
                return "/**\n * Icelandic translation for bootstrap-datetimepicker\n * Hinrik Örn Sigurðsson <hinrik.sig@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['is'] = {\ndays: [\"Sunnudagur\", \"Mánudagur\", \"Þriðjudagur\", \"Miðvikudagur\", \"Fimmtudagur\", \"Föstudagur\", \"Laugardagur\", \"Sunnudagur\"],\ndaysShort: [\"Sun\", \"Mán\", \"Þri\", \"Mið\", \"Fim\", \"Fös\", \"Lau\", \"Sun\"],\ndaysMin: [\"Su\", \"Má\", \"Þr\", \"Mi\", \"Fi\", \"Fö\", \"La\", \"Su\"],\nmonths: [\"Janúar\", \"Febrúar\", \"Mars\", \"Apríl\", \"Maí\", \"Júní\", \"Júlí\", \"Ágúst\", \"September\", \"Október\", \"Nóvember\", \"Desember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Maí\", \"Jún\", \"Júl\", \"Ágú\", \"Sep\", \"Okt\", \"Nóv\", \"Des\"],\ntoday: \"Í Dag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "is";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource is() {
        return isInitializer.get();
    }

    private void itInitializer() {
        it = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.it.js
            public String getText() {
                return "/**\n * Italian translation for bootstrap-datetimepicker\n * Enrico Rubboli <rubboli@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['it'] = {\ndays: [\"Domenica\", \"Lunedi\", \"Martedi\", \"Mercoledi\", \"Giovedi\", \"Venerdi\", \"Sabato\", \"Domenica\"],\ndaysShort: [\"Dom\", \"Lun\", \"Mar\", \"Mer\", \"Gio\", \"Ven\", \"Sab\", \"Dom\"],\ndaysMin: [\"Do\", \"Lu\", \"Ma\", \"Me\", \"Gi\", \"Ve\", \"Sa\", \"Do\"],\nmonths: [\"Gennaio\", \"Febbraio\", \"Marzo\", \"Aprile\", \"Maggio\", \"Giugno\", \"Luglio\", \"Agosto\", \"Settembre\", \"Ottobre\", \"Novembre\", \"Dicembre\"],\nmonthsShort: [\"Gen\", \"Feb\", \"Mar\", \"Apr\", \"Mag\", \"Giu\", \"Lug\", \"Ago\", \"Set\", \"Ott\", \"Nov\", \"Dic\"],\ntoday: \"Oggi\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd/mm/yyyy hh:ii:ss\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "it";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource it() {
        return itInitializer.get();
    }

    private void jaInitializer() {
        ja = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ja.js
            public String getText() {
                return "/**\n * Japanese translation for bootstrap-datetimepicker\n * Norio Suzuki <https://github.com/suzuki/>\n */\n;(function($){\n$.fn.datetimepicker.dates['ja'] = {\ndays: [\"日曜\", \"月曜\", \"火曜\", \"水曜\", \"木曜\", \"金曜\", \"土曜\", \"日曜\"],\ndaysShort: [\"日\", \"月\", \"火\", \"水\", \"木\", \"金\", \"土\", \"日\"],\ndaysMin: [\"日\", \"月\", \"火\", \"水\", \"木\", \"金\", \"土\", \"日\"],\nmonths: [\"1月\", \"2月\", \"3月\", \"4月\", \"5月\", \"6月\", \"7月\", \"8月\", \"9月\", \"10月\", \"11月\", \"12月\"],\nmonthsShort: [\"1月\", \"2月\", \"3月\", \"4月\", \"5月\", \"6月\", \"7月\", \"8月\", \"9月\", \"10月\", \"11月\", \"12月\"],\ntoday: \"今日\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ja";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ja() {
        return jaInitializer.get();
    }

    private void kaInitializer() {
        ka = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ka.js
            public String getText() {
                return "/**\n * Georgian translation for bootstrap-datetimepicker\n * Zura Jijavadze <mailzura@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['ka'] = {\ndays: [\"კვირა\", \"ორშაბათი\", \"სამშაბათი\", \"ოთხშაბათი\", \"ხუთშაბათი\", \"პარასკევი\", \"შაბათი\", \"კვირა\"],\ndaysShort: [\"კვი\", \"ორშ\", \"სამ\", \"ოთხ\", \"ხუთ\", \"პარ\", \"შაბ\", \"კვი\"],\ndaysMin: [\"კვ\", \"ორ\", \"სა\", \"ოთ\", \"ხუ\", \"პა\", \"შა\", \"კვ\"],\nmonths: [\"იანვარი\", \"თებერვალი\", \"მარტი\", \"აპრილი\", \"მაისი\", \"ივნისი\", \"ივლისი\", \"აგვისტო\", \"სექტემბერი\", \"ოქტომბერი\", \"ნოემბერი\", \"დეკემბერი\"],\nmonthsShort: [\"იან\", \"თებ\", \"მარ\", \"აპრ\", \"მაი\", \"ივნ\", \"ივლ\", \"აგვ\", \"სექ\", \"ოქტ\", \"ნოე\", \"დეკ\"],\ntoday: \"დღეს\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));";
            }

            public String getName() {
                return "ka";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ka() {
        return kaInitializer.get();
    }

    private void koInitializer() {
        ko = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ko.js
            public String getText() {
                return "/**\n * Korean translation for bootstrap-datetimepicker\n * Gu Youn <http://github.com/guyoun>\n * Baekjoon Choi <http://github.com/Baekjoon>\n */\n;(function($){\n$.fn.datetimepicker.dates['ko'] = {\ndays: [\"일요일\", \"월요일\", \"화요일\", \"수요일\", \"목요일\", \"금요일\", \"토요일\", \"일요일\"],\ndaysShort: [\"일\", \"월\", \"화\", \"수\", \"목\", \"금\", \"토\", \"일\"],\ndaysMin: [\"일\", \"월\", \"화\", \"수\", \"목\", \"금\", \"토\", \"일\"],\nmonths: [\"1월\", \"2월\", \"3월\", \"4월\", \"5월\", \"6월\", \"7월\", \"8월\", \"9월\", \"10월\", \"11월\", \"12월\"],\nmonthsShort: [\"1월\", \"2월\", \"3월\", \"4월\", \"5월\", \"6월\", \"7월\", \"8월\", \"9월\", \"10월\", \"11월\", \"12월\"],\nsuffix: [],\nmeridiem: [\"오전\", \"오후\"],\n        today: \"오늘\",\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ko";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ko() {
        return koInitializer.get();
    }

    private void ltInitializer() {
        lt = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.lt.js
            public String getText() {
                return "﻿/**\n * Lithuanian translation for bootstrap-datetimepicker\n * Šarūnas Gliebus <ssharunas@yahoo.co.uk>\n */\n\n;(function($){\n    $.fn.datetimepicker.dates['lt'] = {\n        days: [\"Sekmadienis\", \"Pirmadienis\", \"Antradienis\", \"Trečiadienis\", \"Ketvirtadienis\", \"Penktadienis\", \"Šeštadienis\", \"Sekmadienis\"],\n        daysShort: [\"S\", \"Pr\", \"A\", \"T\", \"K\", \"Pn\", \"Š\", \"S\"],\n        daysMin: [\"Sk\", \"Pr\", \"An\", \"Tr\", \"Ke\", \"Pn\", \"Št\", \"Sk\"],\n        months: [\"Sausis\", \"Vasaris\", \"Kovas\", \"Balandis\", \"Gegužė\", \"Birželis\", \"Liepa\", \"Rugpjūtis\", \"Rugsėjis\", \"Spalis\", \"Lapkritis\", \"Gruodis\"],\n        monthsShort: [\"Sau\", \"Vas\", \"Kov\", \"Bal\", \"Geg\", \"Bir\", \"Lie\", \"Rugp\", \"Rugs\", \"Spa\", \"Lap\", \"Gru\"],\n        today: \"Šiandien\",\nsuffix: [],\nmeridiem: [],\n        weekStart: 1\n    };\n}(jQuery));\n";
            }

            public String getName() {
                return "lt";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource lt() {
        return ltInitializer.get();
    }

    private void lvInitializer() {
        lv = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.lv.js
            public String getText() {
                return "/**\n * Latvian translation for bootstrap-datetimepicker\n * Artis Avotins <artis@apit.lv>\n */\n\n;(function($){\n    $.fn.datetimepicker.dates['lv'] = {\n        days: [\"Svētdiena\", \"Pirmdiena\", \"Otrdiena\", \"Trešdiena\", \"Ceturtdiena\", \"Piektdiena\", \"Sestdiena\", \"Svētdiena\"],\n        daysShort: [\"Sv\", \"P\", \"O\", \"T\", \"C\", \"Pk\", \"S\", \"Sv\"],\n        daysMin: [\"Sv\", \"Pr\", \"Ot\", \"Tr\", \"Ce\", \"Pk\", \"St\", \"Sv\"],\n        months: [\"Janvāris\", \"Februāris\", \"Marts\", \"Aprīlis\", \"Maijs\", \"Jūnijs\", \"Jūlijs\", \"Augusts\", \"Septembris\", \"Oktobris\", \"Novembris\", \"Decembris\"],\n        monthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Mai\", \"Jūn\", \"Jūl\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dec.\"],\n        today: \"Šodien\",\nsuffix: [],\nmeridiem: [],\n        weekStart: 1\n    };\n}(jQuery));";
            }

            public String getName() {
                return "lv";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource lv() {
        return lvInitializer.get();
    }

    private void msInitializer() {
        ms = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ms.js
            public String getText() {
                return "/**\n * Malay translation for bootstrap-datetimepicker\n * Ateman Faiz <noorulfaiz@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['ms'] = {\ndays: [\"Ahad\", \"Isnin\", \"Selasa\", \"Rabu\", \"Khamis\", \"Jumaat\", \"Sabtu\", \"Ahad\"],\ndaysShort: [\"Aha\", \"Isn\", \"Sel\", \"Rab\", \"Kha\", \"Jum\", \"Sab\", \"Aha\"],\ndaysMin: [\"Ah\", \"Is\", \"Se\", \"Ra\", \"Kh\", \"Ju\", \"Sa\", \"Ah\"],\nmonths: [\"Januari\", \"Februari\", \"Mac\", \"April\", \"Mei\", \"Jun\", \"Julai\", \"Ogos\", \"September\", \"Oktober\", \"November\", \"Disember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Mei\", \"Jun\", \"Jul\", \"Ogo\", \"Sep\", \"Okt\", \"Nov\", \"Dis\"],\ntoday: \"Hari Ini\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ms";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ms() {
        return msInitializer.get();
    }

    private void nbInitializer() {
        nb = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.nb.js
            public String getText() {
                return "/**\n * Norwegian (bokmål) translation for bootstrap-datetimepicker\n * Fredrik Sundmyhr <http://github.com/fsundmyhr>\n */\n;(function($){\n$.fn.datetimepicker.dates['nb'] = {\ndays: [\"Søndag\", \"Mandag\", \"Tirsdag\", \"Onsdag\", \"Torsdag\", \"Fredag\", \"Lørdag\", \"Søndag\"],\ndaysShort: [\"Søn\", \"Man\", \"Tir\", \"Ons\", \"Tor\", \"Fre\", \"Lør\", \"Søn\"],\ndaysMin: [\"Sø\", \"Ma\", \"Ti\", \"On\", \"To\", \"Fr\", \"Lø\", \"Sø\"],\nmonths: [\"Januar\", \"Februar\", \"Mars\", \"April\", \"Mai\", \"Juni\", \"Juli\", \"August\", \"September\", \"Oktober\", \"November\", \"Desember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Mai\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Des\"],\ntoday: \"I Dag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));";
            }

            public String getName() {
                return "nb";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource nb() {
        return nbInitializer.get();
    }

    private void nlInitializer() {
        nl = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.nl.js
            public String getText() {
                return "/**\n * Dutch translation for bootstrap-datetimepicker\n * Reinier Goltstein <mrgoltstein@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['nl'] = {\ndays: [\"Zondag\", \"Maandag\", \"Dinsdag\", \"Woensdag\", \"Donderdag\", \"Vrijdag\", \"Zaterdag\", \"Zondag\"],\ndaysShort: [\"Zo\", \"Ma\", \"Di\", \"Wo\", \"Do\", \"Vr\", \"Za\", \"Zo\"],\ndaysMin: [\"Zo\", \"Ma\", \"Di\", \"Wo\", \"Do\", \"Vr\", \"Za\", \"Zo\"],\nmonths: [\"Januari\", \"Februari\", \"Maart\", \"April\", \"Mei\", \"Juni\", \"Juli\", \"Augustus\", \"September\", \"Oktober\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mrt\", \"Apr\", \"Mei\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"Vandaag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "nl";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource nl() {
        return nlInitializer.get();
    }

    private void noInitializer() {
        no = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.no.js
            public String getText() {
                return "/**\n * Norwegian translation for bootstrap-datetimepicker\n * Rune Warhuus <rune@dinkdonkd.no>\n */\n;(function($){\n$.fn.datetimepicker.dates['no'] = {\ndays: [\"Søndag\", \"Mandag\", \"Tirsdag\", \"Onsdag\", \"Torsdag\", \"Fredag\", \"Lørdag\", \"Søndag\"],\ndaysShort: [\"Søn\", \"Man\", \"Tir\", \"Ons\", \"Tor\", \"Fre\", \"Lør\", \"Søn\"],\ndaysMin: [\"Sø\", \"Ma\", \"Ti\", \"On\", \"To\", \"Fr\", \"Lø\", \"Sø\"],\nmonths: [\"Januar\", \"Februar\", \"Mars\", \"April\", \"Mai\", \"Juni\", \"Juli\", \"August\", \"September\", \"Oktober\", \"November\", \"Desember\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Mai\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Des\"],\ntoday: \"I Dag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "no";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource no() {
        return noInitializer.get();
    }

    private void plInitializer() {
        pl = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.pl.js
            public String getText() {
                return "/**\n * Polish translation for bootstrap-datetimepicker\n * Robert <rtpm@gazeta.pl>\n */\n;(function($){\n$.fn.datetimepicker.dates['pl'] = {\n        days: [\"Niedziela\", \"Poniedziałek\", \"Wtorek\", \"Środa\", \"Czwartek\", \"Piątek\", \"Sobota\", \"Niedziela\"],\n        daysShort: [\"Nie\", \"Pn\", \"Wt\", \"Śr\", \"Czw\", \"Pt\", \"So\", \"Nie\"],\n        daysMin: [\"N\", \"Pn\", \"Wt\", \"Śr\", \"Cz\", \"Pt\", \"So\", \"N\"],\n        months: [\"Styczeń\", \"Luty\", \"Marzec\", \"Kwiecień\", \"Maj\", \"Czerwiec\", \"Lipiec\", \"Sierpień\", \"Wrzesień\", \"Październik\", \"Listopad\", \"Grudzień\"],\n        monthsShort: [\"Sty\", \"Lu\", \"Mar\", \"Kw\", \"Maj\", \"Cze\", \"Lip\", \"Sie\", \"Wrz\", \"Pa\", \"Lis\", \"Gru\"],\n        today: \"Dzisiaj\",\nsuffix: [],\nmeridiem: [],\n        weekStart: 1\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "pl";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource pl() {
        return plInitializer.get();
    }

    private void pt_BRInitializer() {
        pt_BR = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.pt-BR.js
            public String getText() {
                return "/**\n * Brazilian translation for bootstrap-datetimepicker\n * Cauan Cabral <cauan@radig.com.br>\n */\n;(function($){\n$.fn.datetimepicker.dates['pt-BR'] = {\n        format: 'dd/mm/yyyy',\ndays: [\"Domingo\", \"Segunda\", \"Terça\", \"Quarta\", \"Quinta\", \"Sexta\", \"Sábado\", \"Domingo\"],\ndaysShort: [\"Dom\", \"Seg\", \"Ter\", \"Qua\", \"Qui\", \"Sex\", \"Sáb\", \"Dom\"],\ndaysMin: [\"Do\", \"Se\", \"Te\", \"Qu\", \"Qu\", \"Se\", \"Sa\", \"Do\"],\nmonths: [\"Janeiro\", \"Fevereiro\", \"Março\", \"Abril\", \"Maio\", \"Junho\", \"Julho\", \"Agosto\", \"Setembro\", \"Outubro\", \"Novembro\", \"Dezembro\"],\nmonthsShort: [\"Jan\", \"Fev\", \"Mar\", \"Abr\", \"Mai\", \"Jun\", \"Jul\", \"Ago\", \"Set\", \"Out\", \"Nov\", \"Dez\"],\ntoday: \"Hoje\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "pt_BR";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource pt_BR() {
        return pt_BRInitializer.get();
    }

    private void ptInitializer() {
        pt = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.pt.js
            public String getText() {
                return "/**\n * Portuguese translation for bootstrap-datetimepicker\n * Original code: Cauan Cabral <cauan@radig.com.br>\n * Tiago Melo <tiago.blackcode@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['pt'] = {\ndays: [\"Domingo\", \"Segunda\", \"Terça\", \"Quarta\", \"Quinta\", \"Sexta\", \"Sábado\", \"Domingo\"],\ndaysShort: [\"Dom\", \"Seg\", \"Ter\", \"Qua\", \"Qui\", \"Sex\", \"Sáb\", \"Dom\"],\ndaysMin: [\"Do\", \"Se\", \"Te\", \"Qu\", \"Qu\", \"Se\", \"Sa\", \"Do\"],\nmonths: [\"Janeiro\", \"Fevereiro\", \"Março\", \"Abril\", \"Maio\", \"Junho\", \"Julho\", \"Agosto\", \"Setembro\", \"Outubro\", \"Novembro\", \"Dezembro\"],\nmonthsShort: [\"Jan\", \"Fev\", \"Mar\", \"Abr\", \"Mai\", \"Jun\", \"Jul\", \"Ago\", \"Set\", \"Out\", \"Nov\", \"Dez\"],\nsuffix: [],\nmeridiem: [],\ntoday: \"Hoje\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "pt";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource pt() {
        return ptInitializer.get();
    }

    private void roInitializer() {
        ro = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ro.js
            public String getText() {
                return "/**\n * Romanian translation for bootstrap-datetimepicker\n * Cristian Vasile <cristi.mie@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['ro'] = {\ndays: [\"Duminică\", \"Luni\", \"Marţi\", \"Miercuri\", \"Joi\", \"Vineri\", \"Sâmbătă\", \"Duminică\"],\ndaysShort: [\"Dum\", \"Lun\", \"Mar\", \"Mie\", \"Joi\", \"Vin\", \"Sâm\", \"Dum\"],\ndaysMin: [\"Du\", \"Lu\", \"Ma\", \"Mi\", \"Jo\", \"Vi\", \"Sâ\", \"Du\"],\nmonths: [\"Ianuarie\", \"Februarie\", \"Martie\", \"Aprilie\", \"Mai\", \"Iunie\", \"Iulie\", \"August\", \"Septembrie\", \"Octombrie\", \"Noiembrie\", \"Decembrie\"],\nmonthsShort: [\"Ian\", \"Feb\", \"Mar\", \"Apr\", \"Mai\", \"Iun\", \"Iul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"],\ntoday: \"Astăzi\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ro";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ro() {
        return roInitializer.get();
    }

    private void rs_latinInitializer() {
        rs_latin = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.rs-latin.js
            public String getText() {
                return "/**\n * Serbian latin translation for bootstrap-datetimepicker\n * Bojan Milosavlević <milboj@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['rs'] = {\ndays: [\"Nedelja\",\"Ponedeljak\", \"Utorak\", \"Sreda\", \"Četvrtak\", \"Petak\", \"Subota\", \"Nedelja\"],\ndaysShort: [\"Ned\", \"Pon\", \"Uto\", \"Sre\", \"Čet\", \"Pet\", \"Sub\", \"Ned\"],\ndaysMin: [\"N\", \"Po\", \"U\", \"Sr\", \"Č\", \"Pe\", \"Su\", \"N\"],\nmonths: [\"Januar\", \"Februar\", \"Mart\", \"April\", \"Maj\", \"Jun\", \"Jul\", \"Avgust\", \"Septembar\", \"Oktobar\", \"Novembar\", \"Decembar\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Maj\", \"Jun\", \"Jul\", \"Avg\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"Danas\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "rs_latin";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource rs_latin() {
        return rs_latinInitializer.get();
    }

    private void rsInitializer() {
        rs = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.rs.js
            public String getText() {
                return "/**\n * Serbian cyrillic translation for bootstrap-datetimepicker\n * Bojan Milosavlević <milboj@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['rs'] = {\ndays: [\"Недеља\",\"Понедељак\", \"Уторак\", \"Среда\", \"Четвртак\", \"Петак\", \"Субота\", \"Недеља\"],\ndaysShort: [\"Нед\", \"Пон\", \"Уто\", \"Сре\", \"Чет\", \"Пет\", \"Суб\", \"Нед\"],\ndaysMin: [\"Н\", \"По\", \"У\", \"Ср\", \"Ч\", \"Пе\", \"Су\", \"Н\"],\nmonths: [\"Јануар\", \"Фебруар\", \"Март\", \"Април\", \"Мај\", \"Јун\", \"Јул\", \"Август\", \"Септембар\", \"Октобар\", \"Новембар\", \"Децембар\"],\nmonthsShort: [\"Јан\", \"Феб\", \"Мар\", \"Апр\", \"Мај\", \"Јун\", \"Јул\", \"Авг\", \"Сеп\", \"Окт\", \"Нов\", \"Дец\"],\ntoday: \"Данас\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "rs";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource rs() {
        return rsInitializer.get();
    }

    private void ruInitializer() {
        ru = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ru.js
            public String getText() {
                return "/**\n * Russian translation for bootstrap-datetimepicker\n * Victor Taranenko <darwin@snowdale.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['ru'] = {\ndays: [\"Воскресенье\", \"Понедельник\", \"Вторник\", \"Среда\", \"Четверг\", \"Пятница\", \"Суббота\", \"Воскресенье\"],\ndaysShort: [\"Вск\", \"Пнд\", \"Втр\", \"Срд\", \"Чтв\", \"Птн\", \"Суб\", \"Вск\"],\ndaysMin: [\"Вс\", \"Пн\", \"Вт\", \"Ср\", \"Чт\", \"Пт\", \"Сб\", \"Вс\"],\nmonths: [\"Январь\", \"Февраль\", \"Март\", \"Апрель\", \"Май\", \"Июнь\", \"Июль\", \"Август\", \"Сентябрь\", \"Октябрь\", \"Ноябрь\", \"Декабрь\"],\nmonthsShort: [\"Янв\", \"Фев\", \"Мар\", \"Апр\", \"Май\", \"Июн\", \"Июл\", \"Авг\", \"Сен\", \"Окт\", \"Ноя\", \"Дек\"],\ntoday: \"Сегодня\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));";
            }

            public String getName() {
                return "ru";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ru() {
        return ruInitializer.get();
    }

    private void skInitializer() {
        sk = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.sk.js
            public String getText() {
                return "/**\n * Slovak translation for bootstrap-datetimepicker\n * Marek Lichtner <marek@licht.sk>\n * Fixes by Michal Remiš <michal.remis@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates[\"sk\"] = {\ndays: [\"Nedeľa\", \"Pondelok\", \"Utorok\", \"Streda\", \"Štvrtok\", \"Piatok\", \"Sobota\", \"Nedeľa\"],\ndaysShort: [\"Ned\", \"Pon\", \"Uto\", \"Str\", \"Štv\", \"Pia\", \"Sob\", \"Ned\"],\ndaysMin: [\"Ne\", \"Po\", \"Ut\", \"St\", \"Št\", \"Pi\", \"So\", \"Ne\"],\nmonths: [\"Január\", \"Február\", \"Marec\", \"Apríl\", \"Máj\", \"Jún\", \"Júl\", \"August\", \"September\", \"Október\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Máj\", \"Jún\", \"Júl\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"Dnes\",\nsuffix: [],\nmeridiem: [],\nweekStart: 1,\nformat: \"dd.mm.yyyy\"\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "sk";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource sk() {
        return skInitializer.get();
    }

    private void slInitializer() {
        sl = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.sl.js
            public String getText() {
                return "/**\n * Slovene translation for bootstrap-datetimepicker\n * Gregor Rudolf <gregor.rudolf@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['sl'] = {\ndays: [\"Nedelja\", \"Ponedeljek\", \"Torek\", \"Sreda\", \"Četrtek\", \"Petek\", \"Sobota\", \"Nedelja\"],\ndaysShort: [\"Ned\", \"Pon\", \"Tor\", \"Sre\", \"Čet\", \"Pet\", \"Sob\", \"Ned\"],\ndaysMin: [\"Ne\", \"Po\", \"To\", \"Sr\", \"Če\", \"Pe\", \"So\", \"Ne\"],\nmonths: [\"Januar\", \"Februar\", \"Marec\", \"April\", \"Maj\", \"Junij\", \"Julij\", \"Avgust\", \"September\", \"Oktober\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Maj\", \"Jun\", \"Jul\", \"Avg\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"Danes\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "sl";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource sl() {
        return slInitializer.get();
    }

    private void svInitializer() {
        sv = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.sv.js
            public String getText() {
                return "/**\n * Swedish translation for bootstrap-datetimepicker\n * Patrik Ragnarsson <patrik@starkast.net>\n */\n;(function($){\n$.fn.datetimepicker.dates['sv'] = {\ndays: [\"Söndag\", \"Måndag\", \"Tisdag\", \"Onsdag\", \"Torsdag\", \"Fredag\", \"Lördag\", \"Söndag\"],\ndaysShort: [\"Sön\", \"Mån\", \"Tis\", \"Ons\", \"Tor\", \"Fre\", \"Lör\", \"Sön\"],\ndaysMin: [\"Sö\", \"Må\", \"Ti\", \"On\", \"To\", \"Fr\", \"Lö\", \"Sö\"],\nmonths: [\"Januari\", \"Februari\", \"Mars\", \"April\", \"Maj\", \"Juni\", \"Juli\", \"Augusti\", \"September\", \"Oktober\", \"November\", \"December\"],\nmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"Maj\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Okt\", \"Nov\", \"Dec\"],\ntoday: \"I Dag\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "sv";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource sv() {
        return svInitializer.get();
    }

    private void swInitializer() {
        sw = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.sw.js
            public String getText() {
                return "/**\n * Swahili translation for bootstrap-datetimepicker\n * Edwin Mugendi <https://github.com/edwinmugendi>\n * Source: http://scriptsource.org/cms/scripts/page.php?item_id=entry_detail&uid=xnfaqyzcku\n */\n;(function($){\n    $.fn.datetimepicker.dates['sw'] = {\n        days: [\"Jumapili\", \"Jumatatu\", \"Jumanne\", \"Jumatano\", \"Alhamisi\", \"Ijumaa\", \"Jumamosi\", \"Jumapili\"],\n        daysShort: [\"J2\", \"J3\", \"J4\", \"J5\", \"Alh\", \"Ij\", \"J1\", \"J2\"],\n        daysMin: [\"2\", \"3\", \"4\", \"5\", \"A\", \"I\", \"1\", \"2\"],\n        months: [\"Januari\", \"Februari\", \"Machi\", \"Aprili\", \"Mei\", \"Juni\", \"Julai\", \"Agosti\", \"Septemba\", \"Oktoba\", \"Novemba\", \"Desemba\"],\n        monthsShort: [\"Jan\", \"Feb\", \"Mac\", \"Apr\", \"Mei\", \"Jun\", \"Jul\", \"Ago\", \"Sep\", \"Okt\", \"Nov\", \"Des\"],\n        today: \"Leo\",\nsuffix: [],\nmeridiem: []\n    };\n}(jQuery));\n";
            }

            public String getName() {
                return "sw";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource sw() {
        return swInitializer.get();
    }

    private void thInitializer() {
        th = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.th.js
            public String getText() {
                return "/**\n * Thai translation for bootstrap-datetimepicker\n * Suchau Jiraprapot <seroz24@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['th'] = {\ndays: [\"อาทิตย์\", \"จันทร์\", \"อังคาร\", \"พุธ\", \"พฤหัส\", \"ศุกร์\", \"เสาร์\", \"อาทิตย์\"],\ndaysShort: [\"อา\", \"จ\", \"อ\", \"พ\", \"พฤ\", \"ศ\", \"ส\", \"อา\"],\ndaysMin: [\"อา\", \"จ\", \"อ\", \"พ\", \"พฤ\", \"ศ\", \"ส\", \"อา\"],\nmonths: [\"มกราคม\", \"กุมภาพันธ์\", \"มีนาคม\", \"เมษายน\", \"พฤษภาคม\", \"มิถุนายน\", \"กรกฎาคม\", \"สิงหาคม\", \"กันยายน\", \"ตุลาคม\", \"พฤศจิกายน\", \"ธันวาคม\"],\nmonthsShort: [\"ม.ค.\", \"ก.พ.\", \"มี.ค.\", \"เม.ย.\", \"พ.ค.\", \"มิ.ย.\", \"ก.ค.\", \"ส.ค.\", \"ก.ย.\", \"ต.ค.\", \"พ.ย.\", \"ธ.ค.\"],\ntoday: \"วันนี้\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "th";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource th() {
        return thInitializer.get();
    }

    private void trInitializer() {
        tr = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.tr.js
            public String getText() {
                return "/**\n * Turkish translation for bootstrap-datetimepicker\n * Serkan Algur <kaisercrazy_2@hotmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['tr'] = {\ndays: [\"Pazar\", \"Pazartesi\", \"Salı\", \"Çarşamba\", \"Perşembe\", \"Cuma\", \"Cumartesi\", \"Pazar\"],\ndaysShort: [\"Pz\", \"Pzt\", \"Sal\", \"Çrş\", \"Prş\", \"Cu\", \"Cts\", \"Pz\"],\ndaysMin: [\"Pz\", \"Pzt\", \"Sa\", \"Çr\", \"Pr\", \"Cu\", \"Ct\", \"Pz\"],\nmonths: [\"Ocak\", \"Şubat\", \"Mart\", \"Nisan\", \"Mayıs\", \"Haziran\", \"Temmuz\", \"Ağustos\", \"Eylül\", \"Ekim\", \"Kasım\", \"Aralık\"],\nmonthsShort: [\"Oca\", \"Şub\", \"Mar\", \"Nis\", \"May\", \"Haz\", \"Tem\", \"Ağu\", \"Eyl\", \"Eki\", \"Kas\", \"Ara\"],\ntoday: \"Bugün\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));\n\n";
            }

            public String getName() {
                return "tr";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource tr() {
        return trInitializer.get();
    }

    private void uaInitializer() {
        ua = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.ua.js
            public String getText() {
                return "/**\n * Ukrainian translation for bootstrap-datepicker\n * Igor Polynets\n */\n;(function($){\n$.fn.datetimepicker.dates['ua'] = {\ndays: [\"Неділя\", \"Понеділок\", \"Вівторок\", \"Середа\", \"Четверг\", \"П'ятниця\", \"Субота\", \"Неділя\"],\ndaysShort: [\"Нед\", \"Пнд\", \"Втр\", \"Срд\", \"Чтв\", \"Птн\", \"Суб\", \"Нед\"],\ndaysMin: [\"Нд\", \"Пн\", \"Вт\", \"Ср\", \"Чт\", \"Пт\", \"Сб\", \"Нд\"],\nmonths: [\"Cічень\", \"Лютий\", \"Березень\", \"Квітень\", \"Травень\", \"Червень\", \"Липень\", \"Серпень\", \"Вересень\", \"Жовтень\", \"Листопад\", \"Грудень\"],\nmonthsShort: [\"Січ\", \"Лют\", \"Бер\", \"Квт\", \"Трв\", \"Чер\", \"Лип\", \"Сер\", \"Вер\", \"Жов\", \"Лис\", \"Грд\"],\ntoday: \"Сьогодні\",\nweekStart: 1\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "ua";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource ua() {
        return uaInitializer.get();
    }

    private void ukInitializer() {
        uk = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.uk.js
            public String getText() {
                return "/**\n * Ukrainian translation for bootstrap-datetimepicker\n * Andrey Vityuk <andrey [dot] vityuk [at] gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['uk'] = {\ndays: [\"Неділя\", \"Понеділок\", \"Вівторок\", \"Середа\", \"Четвер\", \"П'ятниця\", \"Субота\", \"Неділя\"],\ndaysShort: [\"Нед\", \"Пнд\", \"Втр\", \"Срд\", \"Чтв\", \"Птн\", \"Суб\", \"Нед\"],\ndaysMin: [\"Нд\", \"Пн\", \"Вт\", \"Ср\", \"Чт\", \"Пт\", \"Сб\", \"Нд\"],\nmonths: [\"Січень\", \"Лютий\", \"Березень\", \"Квітень\", \"Травень\", \"Червень\", \"Липень\", \"Серпень\", \"Вересень\", \"Жовтень\", \"Листопад\", \"Грудень\"],\nmonthsShort: [\"Січ\", \"Лют\", \"Бер\", \"Кві\", \"Тра\", \"Чер\", \"Лип\", \"Сер\", \"Вер\", \"Жов\", \"Лис\", \"Гру\"],\ntoday: \"Сьогодні\",\nsuffix: [],\nmeridiem: []\n};\n}(jQuery));";
            }

            public String getName() {
                return "uk";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource uk() {
        return ukInitializer.get();
    }

    private void zh_CNInitializer() {
        zh_CN = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.zh-CN.js
            public String getText() {
                return "/**\n * Simplified Chinese translation for bootstrap-datetimepicker\n * Yuan Cheung <advanimal@gmail.com>\n */\n;(function($){\n$.fn.datetimepicker.dates['zh-CN'] = {\ndays: [\"星期日\", \"星期一\", \"星期二\", \"星期三\", \"星期四\", \"星期五\", \"星期六\", \"星期日\"],\ndaysShort: [\"周日\", \"周一\", \"周二\", \"周三\", \"周四\", \"周五\", \"周六\", \"周日\"],\ndaysMin:  [\"日\", \"一\", \"二\", \"三\", \"四\", \"五\", \"六\", \"日\"],\nmonths: [\"一月\", \"二月\", \"三月\", \"四月\", \"五月\", \"六月\", \"七月\", \"八月\", \"九月\", \"十月\", \"十一月\", \"十二月\"],\nmonthsShort: [\"一月\", \"二月\", \"三月\", \"四月\", \"五月\", \"六月\", \"七月\", \"八月\", \"九月\", \"十月\", \"十一月\", \"十二月\"],\ntoday: \"今天\",\nsuffix: [],\nmeridiem: [\"上午\", \"下午\"]\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "zh_CN";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource zh_CN() {
        return zh_CNInitializer.get();
    }

    private void zh_TWInitializer() {
        zh_TW = new org.gwtproject.resources.client.TextResource() {
            // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/datetimepicker/client/resource/js/locales-2.4.4/bootstrap-datetimepicker.zh-TW.js
            public String getText() {
                return "/**\n * Traditional Chinese translation for bootstrap-datetimepicker\n * Rung-Sheng Jang <daniel@i-trend.co.cc>\n */\n;(function($){\n$.fn.datetimepicker.dates['zh-TW'] = {\ndays: [\"星期日\", \"星期一\", \"星期二\", \"星期三\", \"星期四\", \"星期五\", \"星期六\", \"星期日\"],\n  daysShort: [\"周日\", \"周一\", \"周二\", \"周三\", \"周四\", \"周五\", \"周六\", \"周日\"],\ndaysMin:  [\"日\", \"一\", \"二\", \"三\", \"四\", \"五\", \"六\", \"日\"],\nmonths: [\"一月\", \"二月\", \"三月\", \"四月\", \"五月\", \"六月\", \"七月\", \"八月\", \"九月\", \"十月\", \"十一月\", \"十二月\"],\nmonthsShort: [\"一月\", \"二月\", \"三月\", \"四月\", \"五月\", \"六月\", \"七月\", \"八月\", \"九月\", \"十月\", \"十一月\", \"十二月\"],\ntoday: \"今天\",\n    suffix: [],\nmeridiem: [\"上午\", \"下午\"]\n};\n}(jQuery));\n";
            }

            public String getName() {
                return "zh_TW";
            }
        }
        ;
    }

    public org.gwtproject.resources.client.TextResource zh_TW() {
        return zh_TWInitializer.get();
    }

    public ResourcePrototype[] getResources() {
        return new ResourcePrototype[]{
                dateTimePicker(),
                ar(),
                az(),
                bg(),
                bn(),
                ca(),
                cs(),
                da(),
                de(),
                ee(),
                el(),
                es(),
                fi(),
                fr(),
                he(),
                hr(),
                hu(),
                id(),
                is(),
                it(),
                ja(),
                ka(),
                ko(),
                lt(),
                lv(),
                ms(),
                nb(),
                nl(),
                no(),
                pl(),
                pt_BR(),
                pt(),
                ro(),
                rs_latin(),
                rs(),
                ru(),
                sk(),
                sl(),
                sv(),
                sw(),
                th(),
                tr(),
                ua(),
                uk(),
                zh_CN(),
                zh_TW(),
        };
    }

    public ResourcePrototype getResource(String name) {
        if (resourceMap == null) {
            resourceMap = new java.util.HashMap<String, ResourcePrototype>();
            resourceMap.put("dateTimePicker", dateTimePicker());
            resourceMap.put("ar", ar());
            resourceMap.put("az", az());
            resourceMap.put("bg", bg());
            resourceMap.put("bn", bn());
            resourceMap.put("ca", ca());
            resourceMap.put("cs", cs());
            resourceMap.put("da", da());
            resourceMap.put("de", de());
            resourceMap.put("ee", ee());
            resourceMap.put("el", el());
            resourceMap.put("es", es());
            resourceMap.put("fi", fi());
            resourceMap.put("fr", fr());
            resourceMap.put("he", he());
            resourceMap.put("hr", hr());
            resourceMap.put("hu", hu());
            resourceMap.put("id", id());
            resourceMap.put("is", is());
            resourceMap.put("it", it());
            resourceMap.put("ja", ja());
            resourceMap.put("ka", ka());
            resourceMap.put("ko", ko());
            resourceMap.put("lt", lt());
            resourceMap.put("lv", lv());
            resourceMap.put("ms", ms());
            resourceMap.put("nb", nb());
            resourceMap.put("nl", nl());
            resourceMap.put("no", no());
            resourceMap.put("pl", pl());
            resourceMap.put("pt_BR", pt_BR());
            resourceMap.put("pt", pt());
            resourceMap.put("ro", ro());
            resourceMap.put("rs_latin", rs_latin());
            resourceMap.put("rs", rs());
            resourceMap.put("ru", ru());
            resourceMap.put("sk", sk());
            resourceMap.put("sl", sl());
            resourceMap.put("sv", sv());
            resourceMap.put("sw", sw());
            resourceMap.put("th", th());
            resourceMap.put("tr", tr());
            resourceMap.put("ua", ua());
            resourceMap.put("uk", uk());
            resourceMap.put("zh_CN", zh_CN());
            resourceMap.put("zh_TW", zh_TW());
        }
        return resourceMap.get(name);
    }

    private static class dateTimePickerInitializer {

        static {
            _instance0.dateTimePickerInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return dateTimePicker;
        }
    }

    private static class arInitializer {

        static {
            _instance0.arInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ar;
        }
    }

    private static class azInitializer {

        static {
            _instance0.azInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return az;
        }
    }

    private static class bgInitializer {

        static {
            _instance0.bgInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return bg;
        }
    }

    private static class bnInitializer {

        static {
            _instance0.bnInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return bn;
        }
    }

    private static class caInitializer {

        static {
            _instance0.caInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ca;
        }
    }

    private static class csInitializer {

        static {
            _instance0.csInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return cs;
        }
    }

    private static class daInitializer {

        static {
            _instance0.daInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return da;
        }
    }

    private static class deInitializer {

        static {
            _instance0.deInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return de;
        }
    }

    private static class eeInitializer {

        static {
            _instance0.eeInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ee;
        }
    }

    private static class elInitializer {

        static {
            _instance0.elInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return el;
        }
    }

    private static class esInitializer {

        static {
            _instance0.esInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return es;
        }
    }

    private static class fiInitializer {

        static {
            _instance0.fiInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return fi;
        }
    }

    private static class frInitializer {

        static {
            _instance0.frInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return fr;
        }
    }

    private static class heInitializer {

        static {
            _instance0.heInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return he;
        }
    }

    private static class hrInitializer {

        static {
            _instance0.hrInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return hr;
        }
    }

    private static class huInitializer {

        static {
            _instance0.huInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return hu;
        }
    }

    private static class idInitializer {

        static {
            _instance0.idInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return id;
        }
    }

    private static class isInitializer {

        static {
            _instance0.isInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return is;
        }
    }

    private static class itInitializer {

        static {
            _instance0.itInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return it;
        }
    }

    private static class jaInitializer {

        static {
            _instance0.jaInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ja;
        }
    }

    private static class kaInitializer {

        static {
            _instance0.kaInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ka;
        }
    }

    private static class koInitializer {

        static {
            _instance0.koInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ko;
        }
    }

    private static class ltInitializer {

        static {
            _instance0.ltInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return lt;
        }
    }

    private static class lvInitializer {

        static {
            _instance0.lvInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return lv;
        }
    }

    private static class msInitializer {

        static {
            _instance0.msInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ms;
        }
    }

    private static class nbInitializer {

        static {
            _instance0.nbInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return nb;
        }
    }

    private static class nlInitializer {

        static {
            _instance0.nlInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return nl;
        }
    }

    private static class noInitializer {

        static {
            _instance0.noInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return no;
        }
    }

    private static class plInitializer {

        static {
            _instance0.plInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return pl;
        }
    }

    private static class pt_BRInitializer {

        static {
            _instance0.pt_BRInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return pt_BR;
        }
    }

    private static class ptInitializer {

        static {
            _instance0.ptInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return pt;
        }
    }

    private static class roInitializer {

        static {
            _instance0.roInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ro;
        }
    }

    private static class rs_latinInitializer {

        static {
            _instance0.rs_latinInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return rs_latin;
        }
    }

    private static class rsInitializer {

        static {
            _instance0.rsInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return rs;
        }
    }

    private static class ruInitializer {

        static {
            _instance0.ruInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ru;
        }
    }

    private static class skInitializer {

        static {
            _instance0.skInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return sk;
        }
    }

    private static class slInitializer {

        static {
            _instance0.slInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return sl;
        }
    }

    private static class svInitializer {

        static {
            _instance0.svInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return sv;
        }
    }

    private static class swInitializer {

        static {
            _instance0.swInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return sw;
        }
    }

    private static class thInitializer {

        static {
            _instance0.thInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return th;
        }
    }

    private static class trInitializer {

        static {
            _instance0.trInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return tr;
        }
    }

    private static class uaInitializer {

        static {
            _instance0.uaInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return ua;
        }
    }

    private static class ukInitializer {

        static {
            _instance0.ukInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return uk;
        }
    }

    private static class zh_CNInitializer {

        static {
            _instance0.zh_CNInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return zh_CN;
        }
    }

    private static class zh_TWInitializer {

        static {
            _instance0.zh_TWInitializer();
        }

        static org.gwtproject.resources.client.TextResource get() {
            return zh_TW;
        }
    }
}
