// Load dotenv file
require('dotenv').config();

const express = require('express');
const app = express();
const port = process.env.PORT || 3000;

const secretWord = process.env.SECRET_WORD;

app.get('/', (req, res) => {
    res.send('Secret word:' + secretWord);
});

app.listen(port, () => {
    console.log(`Server is listening at http://localhost:${port}`);
});
