<?php

  include './conexao.php';

  $id = uniqid();
  $nome = $_POST['nome'];
  $altura = $_POST['altura'];
  $peso = $_POST['peso'];
  $imc = $peso/($altura*$altura);

  $sqlInsert = "INSERT INTO `user` VALUES (
    '$id',
    '$nome',
    $altura,
    $peso,
    $imc
  )";

  $insertResult = $conexao->query($sqlInsert);

?>