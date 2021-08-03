<template>
  <div id="app">
    <h3 v-for="user in users" :key="user.id">{{user.name}} : {{user.phone}}</h3>
  </div>
</template>

<script>
export default {
  data () {
    return {
      users: []
    }
  },
  created () {
    this.$http.get('/api/users').then(response => {
      this.users = response.data.response
    })
  }
}
</script>

<style>

</style>
