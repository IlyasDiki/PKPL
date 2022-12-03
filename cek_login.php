<?php
session_start();

include 'db_connect.php';

$username = $_POST['username'];
$password = md5($_POST['password']);

$login = mysqli_query($koneksi, "select * from user where username='$username' and password='$password'");
$cek = mysqli_num_rows($login);

if($cek > 0) {

	$data = mysqli_fetch_assoc($login);

	if($data['level']=="admin") {

		$_SESSION['username'] = $username;
		$_SESSION['level'] = "admin";

		header("location:home.php");
	}
} else {
	echo "
    <br /> <br />
    <br /> <br />
    <br /> <br />
    <br /> <br />
    <div align='center'>
        <div id='content'>
            <div align='center'>
            <br />

            <table width='303' border='0' cellpadding='0' cellspacing='0' class='form3'>
                <tr>
                    <td>
                        <div align='center'>
                            <a href='index.php'>
                                <b>
                                    <img src='img/icn_alert_warning.png' width='24' height='24' border='0'/>
                                </b>
                            </a>
                            <br />

                            <a href='index.php'><b>Ulangi Sekali Lagi</b></a>
                        </div>
                    </td>
                </tr>
            </table>

            <br /> <br />
        </div>
    </div>";

}

?>