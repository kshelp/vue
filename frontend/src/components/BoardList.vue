<template>
  <div id="app">
  <h3 v-for="board in boardList" :key="board.num">{{board.title}} : {{board.writeDate}}</h3>
  </div>
</template>

<script>
export default {
  data () {
    return {
      boardList: []
    }
  },
  created () {
    this.$http.get('/api/boardList').then(response => {
      this.boardList = response.data.response
    })
  }
}
</script>

<style>

</style>
