<?php
require_once('koneksi.php');
require_once('utils.php');

if (!isset($_POST['title']) || !isset($_POST['content'])) {
    die('Method not allowed');
} 

$txtCode = gen_random_string(6);
$saveTitle = $db_connect->real_escape_string($_POST['title']);
$txtTitle = substr($saveTitle,0,20);
$txtContent = $db_connect->real_escape_string($_POST['content']);

$query = "INSERT INTO paciltxt_post(code, title, content) VALUES ('".."', '".$txtTitle."', '".$txtContent."')";
$sql = $db_connect->query($query);
if ($db_connect->error) {
    header('Location: /');
}

header('Location: /view.php?code='.$txtCode);