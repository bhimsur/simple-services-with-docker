var express = require('express');
var router = express.Router();
const apiAdapter = require('./apiAdapter');
const BASE_URL = process.env.API_URL;
const api = apiAdapter(BASE_URL);

let endpointPost = ["/add", "/update"];
let endpointGet = ["/list"];

endpointPost.forEach(function (item) {
    router.post(item, (req, res) => {
        api.post(req.path, req.body).then(response => {
            res.send(response.data);
        });
    });
});

endpointGet.forEach(item => {
    router.get(item, (req, res) => {
        api.get(req.path, req.body).then(response => {
            res.send(response.data);
        });
    });
});

module.exports = router;
