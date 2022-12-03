<?php
if(isset($_POST['nama']) && $_POST['nama']) {

    include 'db_connect.php';

    $nama = $_POST['nama'];
    $alamat = $_POST['alamat'];
    $tempat_lahir = $_POST['tempat_lahir'];
    $tanggal_lahir = $_POST['tanggal_lahir'];
    $jenis_kelamin = $_POST['jenis_kelamin'];
    $telepon = $_POST['telepon'];
    $status = $_POST['status'];

    $sql = "INSERT INTO karyawan(nama, alamat, tempat_lahir, tanggal_lahir, jenis_kelamin, telepon, status) VALUES ('$nama', '$alamat', '$tempat_lahir', '$tanggal_lahir', '$jenis_kelamin', '$telepon', '$status')";
    $insert = mysqli_query($koneksi, $sql);

    if(! $insert) {
        echo "<script>alert('Input Gagal'); window.location.href = './dokumen_baru.php';</script>";
    } else {
        echo "<script>alert('Input Berhasil'); window.location = '../smartschool/dokumen.php'</script>";
    }
}
?>
