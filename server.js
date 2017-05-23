var express = require('express')
var app = express()

app.get('/', function (req, res) {
  res.send('Hello World, Ich bin Winter, update at 2017.5.23!')
})

app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})
