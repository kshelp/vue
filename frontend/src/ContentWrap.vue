<template>
  <!-- Content Wrapper. Contains page content -->
  <div id="content-wrap" class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Dashboard
        <small>Version 2.0</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>

    <section class="content">
      <transition name="page" mode="out-in">
        <router-view></router-view>
      </transition>
      <table border=1>
      <tr>
        <th>게시판 목록</th>
        <th>사용자 목록</th>
      </tr>
      <tr>
        <td><BoardList></BoardList></td>
        <td><UserList></UserList></td>
      </tr>
    </table>
      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
</template>

<script>
import BoardList from './components/BoardList.vue'
import UserList from './components/UserList.vue'
export default {
  name: 'va-content-wrap',
  created () {

  },
  components: {
    'BoardList': BoardList,
    'UserList': UserList
  }
}
</script>

<style>
.page-enter-active, .page-leave-active {
  transition: opacity 0.5s, transform 0.5s;
}
.page-enter, .page-leave-to {
  opacity: 0;
}
</style>
