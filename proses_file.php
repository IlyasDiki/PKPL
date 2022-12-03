<?php
if(isset($_POST['id']) && $_POST['id']) {

    include 'db_connect.php';

    $id_karyawan = $_POST['id_karyawan'];
    $id_dokumen = $_POST['id_dokumen'];
    $file_dokumen = $_POST['file_dokumen'];
    $tanggal_lahir = $_POST['tanggal_lahir'];
    $tanggal_simpan = $_POST['tanggal_simpan'];

    $sql = "INSERT INTO karyawan(id_karyawan, id_dokumen, file_dokumen, tanggal_lahir, tanggal_simpan) VALUES ('$id_karyawan', '$id_dokumen', '$file_dokumen', '$tanggal_lahir', '$tanggal_simpan')";
    $insert = mysqli_query($koneksi, $sql);

    if(! $insert) {
        echo "<script>alert('Input Gagal'); window.location.href = './dokumen_baru.php';</script>";
    } else {
        echo "<script>alert('Input Berhasil'); window.location = '../smartschool/dokumen.php'</script>";
    }
}
?>
