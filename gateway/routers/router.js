var express = require('express');
var router = express.Router();
var toDoService = require('./toDoService');

router.use((req, res, next) => {
    console.log("Called: ", req.baseUrl+req.path);
    next();
});

router.use(toDoService);
module.exports = router;