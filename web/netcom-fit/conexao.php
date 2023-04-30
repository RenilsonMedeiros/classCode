<?php

  $host = "localhost";
  $username = "netcom";
  $password = "netNet12@gmail.com";
  $dbName = "netcomfit_db";

  $conexao = mysqli_connect($host, $username, $password, $dbName);

  if(!$conexao) {
    echo "Erro na conexão com o banco: " + mysqli_connect_error();
  }
?>