<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Mybatis Generator</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="css/bootstrap.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="css/AdminLTE.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="css/skins/_all-skins.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition skin-red sidebar-mini" onload="readConf()">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>MB</b>G</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Mybatis</b>Generator</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>

     
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
    
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">

        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Configure</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul id="menu" class="treeview-menu">
          </ul>
        </li>
      </ul>
    </section>
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">

    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-12">
          <!-- general form elements -->
          <div class="box box-danger">
            <div class="box-header with-border">
              <h3 class="box-title">Quick Generator</h3>
            <!-- form start -->
            <form role="form" id="mbg">
            
                <div class="form-group">
                  <div class="col-md-12" >
                      <label>主机名或IP地址 url</label>
                      <input type="text" class="form-control" id="ip" name="ip" placeholder="Enter IP">
                  </div>
                </div>

                <div class="form-group">
                  <div class="column">
                    <div class="col-md-6" >
                      <label>数据库</label>
                      <input type="text" class="form-control" id="db" name="db" placeholder="Enter DB">
                    </div>
                    <div class="col-md-6" >
                      <label>端口</label>
                      <input type="text" class="form-control" id="port" name="port" placeholder="Enter Port">
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <div class="column">
                    <div class="col-md-6" >
                      <label>用户名</label>
                      <input type="text" class="form-control" id="username" name="username" placeholder="Enter UserName">
                    </div>
                    <div class="col-md-6" >
                      <label>密码</label>
                      <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password">
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <div class="column">
                    <div class="col-md-12" >
                      <label>生成模型的包名</label>
                      <input type="text" class="form-control" id="modelpackagename" name="modelpackagename" placeholder="Enter Model PackageName">
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <div class="column">
                    <div class="col-md-12" >
                      <label>生成DAO的包名</label>
                      <input type="text" class="form-control" id="daopackagename" name="daopackagename" placeholder="Enter Dao PackageName">
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <div class="column">
                    <div class="col-md-12" >
                      <label>生成映射文件的位置</label>
                      <input type="text" class="form-control" id="mapperpath" name="mapperpath" placeholder="Enter Mapper Path">
                    </div>
                  </div>
                </div>

                <div class="form-group" id="tables">
                  <div class="column">
                    <div class="col-md-4" >
                      <label>表名称</label>
                      <input type="text" class="form-control"  name="tablenames" placeholder="Enter test_table">
                    </div>
                    <div class="col-md-4" >
                      <label>模型名称</label>
                      <input type="text" class="form-control"  name="tablemodels" placeholder="Enter TestTable">
                    </div>
                    <div class="col-md-4" >
                        <button type="button" class="btn btn-primary" onclick="addTable()" style="margin-top: 25px">添加表</button>
                        <button type="button" class="btn btn-danger" onclick="rmTable(this)" style="margin-top: 25px">删除</button>
                    </div>
                 </div>
                </div>

              <div class="box-footer">
                <button type="button" class="btn btn-primary" onclick="gen()">生成</button>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">保存配置</button>
                  <button type="button" class="btn btn-danger" onclick="clearconf()">清除配置</button>
              </div>
            </form>

                <div class="modal fade" tabindex="-1" role="dialog" id="myModal">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title">输入配置名称 Conf Name</h4>
                            </div>
                            <div class="modal-body">
                                <input type="text" id="confname" class="form-control"  value="conf_name">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary" onclick="saveConf()">Save</button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal-dialog -->
                </div>

          </div>

        </div>
      </div>
    </section>
  </div>
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.0.0
    </div>
    <strong><a href="https://github.com/lishuo9527/MybatisGenerator-UI">Mybatis Generator UI</a>.</strong>
  </footer>

  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>


<!-- jQuery 2.2.3 -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="js/app.min.js"></script>

<script src="js/biz.js"></script>
</body>
</html>
