<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="author" content="Script Tutorials" />
        <title>全部-爱比价网</title>

        <link href="../style/main.css" rel="stylesheet" type="text/css" />
        <link href="../style/style.css" rel="stylesheet" type="text/css" />
        <link href="../style/material-icons.css" rel="stylesheet" type="text/css" />
        <link href="../style/font-awesome.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="../js/jquery.js"></script>
        <script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
        <script type="text/javascript" src="../js/activity.js"></script>


    </head>
    <body>
        <div class="container" id="navigationBar" role="navigation">
            <ul class="menu">
                <img src="images/logo.png">
                <li><a href="index.jsp">首页</a></li>
                <li class="active"><a href="goods.jsp">商品</a>
                    <ul class="submenu">
                        <li><a href="goods.jsp">所有商品</a></li>
                        <li><a href="myFavorites.html">我的收藏</a></li>
                    </ul>
                </li>
                <li><a href="#">模块二</a>
                    <ul class="submenu">
                        <li><a href="#">201</a></li>
                        <li><a href="#">202</a></li>
                        <li><a href="#">203</a></li>
                    </ul>
                </li>
                <li><a href="#">模块三</a>
                <ul class="submenu">
                    <li><a href="#">301</a></li>
                    <li><a href="#">302</a></li>
                </ul>
                </li>
                <li><a href="personal.html">个人信息</a></li>
                <span class="big-icon navigation-right-icon">
                    <i class="material-icons">exit_to_app</i>
                    <i class="fa-middle fa-bell"></i>
                </span>
            </ul>
        </div>
        <!--小三角，勿删-->
        <div class="menu-triangle menu-triangle-two triangle"></div>
        <!--小三角结束，正文开始-->

        <div class="all-elements">
            <div class="activity-holder">
                <!--上面的那三个按钮-->
                <div class="activity-btn-holder">
                    <button class="activity-est activity-btn-selected" id="newestBtn" onclick="activeBtn(this)" active="true">好评率</button>
                    <button class="activity-est activity-btn" id="hotestBtn" onclick="activeBtn(this)" active="false">价格</button>
                    <input class="normal-input top-search" id="wordInput">
                    <button class="search-holder-button top-search-btn" onclick="searchWord()">搜索</button>

                    <!--<button class="activity-new activity-btn" id="addBtn">+ 添加活动</button>-->
                </div>
                <span id="goodsList">

                </span>
                <!-- 进入到一个一个活动的部分-->
                <!-- per-activity 是每一个活动-->
                <%--<div class="per-activity">--%>
                    <%--<div class="activity-head-holder">--%>
                        <%--<h1>科比10总决赛G7球衣</h1>--%>
                        <%--<h4>淘宝网</h4>--%>
                    <%--</div>--%>

                    <%--<div class="full-photo-holder">--%>
                        <%--<span class="photo-item">--%>
                             <%--<img src="images/basketball.png">--%>
                             <%--<span class="icover"></span>--%>
                        <%--</span>--%>
                        <%--<div class="activity-description">--%>
                        <%--<p>最新价格：<span class="price-text">￥5000.00</span></p>--%>
                        <%--<a href="goodsDetail.jsp">查看详情</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<!--<div class="per-activity-footer">-->--%>
                       <%--<!---->--%>
                    <%--<!--</div>-->--%>
                <%--</div>--%>
                <%--<div class="per-activity">--%>
                    <%--<div class="activity-head-holder">--%>
                        <%--<h1>科比10总决赛G7球衣</h1>--%>
                        <%--<h4>淘宝网</h4>--%>
                    <%--</div>--%>

                    <%--<div class="full-photo-holder">--%>
                        <%--<span class="photo-item">--%>
                             <%--<img src="images/basketball.png">--%>
                             <%--<span class="icover"></span>--%>
                        <%--</span>--%>
                    <%--</div>--%>
                    <%--<div class="activity-description">--%>
                        <%--<p>最新价格：<span class="price-text">￥5000.00</span></p>--%>
                        <%--<a href="goodsDetail.jsp">查看详情</a>--%>
                    <%--</div>--%>
                    <%--<!--<div class="per-activity-footer">-->--%>
                    <%--<!---->--%>
                    <%--<!--</div>-->--%>
                <%--</div>--%>
                <%--<div class="per-activity">--%>
                <%--<div class="activity-head-holder">--%>
                    <%--<h1>科比10总决赛G7球衣</h1>--%>
                    <%--<h4>淘宝网</h4>--%>
                <%--</div>--%>

                <%--<div class="full-photo-holder">--%>
                        <%--<span class="photo-item">--%>
                             <%--<img src="images/basketball.png">--%>
                             <%--<span class="icover"></span>--%>
                        <%--</span>--%>
                <%--</div>--%>
                <%--<div class="activity-description">--%>
                    <%--<p>最新价格：<span class="price-text">￥5000.00</span></p>--%>
                    <%--<a href="goodsDetail.jsp">查看详情</a>--%>
                <%--</div>--%>
                <%--<!--<div class="per-activity-footer">-->--%>
                <%--<!---->--%>
                <%--<!--</div>-->--%>
            <%--</div>--%>
               <%----%>
                <%--<div class="per-activity">--%>
                    <%--<div class="activity-head-holder">--%>
                        <%--<h1>科比10总决赛G7球衣</h1>--%>
                        <%--<h4>淘宝网</h4>--%>
                    <%--</div>--%>

                    <%--<div class="full-photo-holder">--%>
                        <%--<span class="photo-item">--%>
                             <%--<img src="images/basketball.png">--%>
                             <%--<span class="icover"></span>--%>
                        <%--</span>--%>
                    <%--</div>--%>
                    <%--<div class="activity-description">--%>
                        <%--<p>最新价格：<span class="price-text">￥5000.00</span></p>--%>
                        <%--<a href="goodsDetail.jsp">查看详情</a>--%>
                    <%--</div>--%>
                    <!--<div class="per-activity-footer">-->
                    <!---->
                    <!--</div>-->
                </div>

            </div>
            <div class="footer">
                <div class="decoration-center"></div>
                <h1>
                    Copyright &copy; 2016 - 2017 爱比价网. All Rights Reserved.
                </h1>
            </div>
        </div>

<script>
    function searchWord() {
        var goodsList = document.getElementById("goodsList");
        var wordInput = document.getElementById("wordInput");
        $.ajax({
            url: "/search",
            type: "POST",
            data: {
                keyword: btn.wid
            },
            dataType: 'JSON',
            async: false,
            success: function (data) {
                $.each(data, function (idx, item) {
                    var perGood = document.createElement("div");
                    perGood.className = "per-activity";
                    var perGoodHead = document.createElement("div");
                    perGoodHead.className = "activity-head-holder";
                    var goodsName = document.createElement("h1");
                    goodsName.innerHTML = item.name;
                    perGoodHead.appendChild(goodsName);

                    var goodsDetail = document.createElement("div");
                    goodsDetail.className = "full-photo-holder";

                    var perPhotoDiv = document.createElement("span");
                    perPhotoDiv.className = "photo-item";
                    var perPhoto = document.createElement("img");
                    perPhoto.src = item.imgUrl;
                    var icover = document.createElement("span");
                    icover.className = "icover";
                    perPhotoDiv.appendChild(perPhoto);
                    perPhotoDiv.appendChild(icover);
                    goodsDetail.appendChild(perPhotoDiv);
                    var perFoot = document.createElement("div");
                    perFoot.className = "activity-description";
                    var footP = document.createElement("p");
                    footP.innerHTML = "最新价格：<span class='price-text'>" + "￥" + item.price + "</span>";
                    var detailBtn = document.createElement("a");
                    detailBtn.innerHTML = "查看详情";
                    detailBtn.gid = item.id;
                    detailBtn.onclick = function () {
                        toGoodsDetail(this);
                    }
                    perFoot.appendChild(footP);
                    perFoot.appendChild(detailBtn);
                    goodsDetail.appendChild(perFoot);

                    perGood.appendChild(perGoodHead);
                    perGood.appendChild(goodsDetail);

                    goodsList.appendChild(perGood);
                });
            }
        });
    }
    function toGoodsDetail(btn) {
        window.location.href = "goodsDetail.html?goodsId=" + btn.gid;
    }

</script>
    </body>
</html>