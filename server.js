var express = require('express')
var app = express()

app.get('/', function (req, res) {
  res.send('Hallo World, Ich bin Winter, update at 2018.03.08!')
})

app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})
