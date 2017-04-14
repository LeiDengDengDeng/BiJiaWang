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
                    <input class="normal-input top-search">
                    <button class="search-holder-button top-search-btn">搜索</button>

                    <!--<button class="activity-new activity-btn" id="addBtn">+ 添加活动</button>-->
                </div>
                <!-- 进入到一个一个活动的部分-->
                <!-- per-activity 是每一个活动-->
                <div class="per-activity">
                    <div class="activity-head-holder">
                        <h1>科比10总决赛G7球衣</h1>
                        <h4>淘宝网</h4>
                    </div>

                    <div class="full-photo-holder">
                        <span class="photo-item">
                             <img src="images/basketball.png">
                             <span class="icover"></span>
                        </span>
                        <div class="activity-description">
                        <p>最新价格：<span class="price-text">￥5000.00</span></p>
                        <a href="goodsDetail.html">查看详情</a>
                        </div>
                    </div>

                    <!--<div class="per-activity-footer">-->
                       <!---->
                    <!--</div>-->
                </div>
                <div class="per-activity">
                    <div class="activity-head-holder">
                        <h1>科比10总决赛G7球衣</h1>
                        <h4>淘宝网</h4>
                    </div>

                    <div class="full-photo-holder">
                        <span class="photo-item">
                             <img src="images/basketball.png">
                             <span class="icover"></span>
                        </span>
                    </div>
                    <div class="activity-description">
                        <p>最新价格：<span class="price-text">￥5000.00</span></p>
                        <a href="goodsDetail.html">查看详情</a>
                    </div>
                    <!--<div class="per-activity-footer">-->
                    <!---->
                    <!--</div>-->
                </div>
                <div class="per-activity">
                    <div class="activity-head-holder">
                        <h1>科比10总决赛G7球衣</h1>
                        <h4>淘宝网</h4>
                    </div>

                    <div class="full-photo-holder">
                        <span class="photo-item">
                             <img src="images/basketball.png">
                             <span class="icover"></span>
                        </span>
                    </div>
                    <div class="activity-description">
                        <p>最新价格：<span class="price-text">￥5000.00</span></p>
                        <a href="goodsDetail.html">查看详情</a>
                    </div>
                    <!--<div class="per-activity-footer">-->
                    <!---->
                    <!--</div>-->
                </div>
                <div class="per-activity">
                    <div class="activity-head-holder">
                        <h1>科比10总决赛G7球衣</h1>
                        <h4>淘宝网</h4>
                    </div>

                    <div class="full-photo-holder">
                        <span class="photo-item">
                             <img src="images/basketball.png">
                             <span class="icover"></span>
                        </span>
                    </div>
                    <div class="activity-description">
                        <p>最新价格：<span class="price-text">￥5000.00</span></p>
                        <a href="goodsDetail.html">查看详情</a>
                    </div>
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


    </body>
</html>