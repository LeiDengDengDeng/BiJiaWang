/**
 * Created by mr.meng on 17/3/9.
 */


$(document).ready(

);

function changeToColor(btn){
    $("#"+btn.id).removeClass("fa-heart-o-grey");
    $("#"+btn.id).addClass("fa-heart-red");
    //$("#text"+btn.id).removeClass("text-hide");
    //$("#text"+btn.id).addClass("text-show");
    //$("#"+btn.id).setAttribute("color","#bc0000");
}

function changeToGrey(btn){
    $("#"+btn.id).removeClass("fa-heart-red");
    $("#"+btn.id).addClass("fa-heart-o-grey");
    //$("#text"+btn.id).removeClass("text-show");
    //$("#text"+btn.id).addClass("text-hide");
    //$("#"+btn.id).style.color="darkgray";
}

function showTip(btn){

}

function removeTip(btn){

}

function activeBtn(btn){
    var newestBtn = document.getElementById("newestBtn");
    var hotestBtn = document.getElementById("hotestBtn");

    if(btn.active!="true"){
        if(btn.id=="newestBtn"){  //选中"最新"按钮
            $("#newestBtn").removeClass("activity-btn");
            $("#newestBtn").addClass("activity-btn-selected");
            $("#hotestBtn").removeClass("activity-btn-selected");
            $("#hotestBtn").addClass("activity-btn");
            newestBtn.active="true";
            hotestBtn.active="false";
        }else{                    //选中"最热"按钮
            $("#hotestBtn").removeClass("activity-btn");
            $("#hotestBtn").addClass("activity-btn-selected");
            $("#newestBtn").removeClass("activity-btn-selected");
            $("#newestBtn").addClass("activity-btn");
            hotestBtn.active="true";
            newestBtn.active="false";
        }

    }

}
