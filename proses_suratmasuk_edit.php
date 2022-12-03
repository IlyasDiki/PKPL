<?php
if(isset($_POST['nomer_surat']) && $_POST['nomer_surat']) {

    include 'db_connect.php';

    $id=$_POST['id'];
    $nomer_surat = $_POST['nomer_surat'];
    $id_kategori = $_POST['id_kategori'];
    $perihal = $_POST['perihal'];
    $nama_pengirim = $_POST['nama_pengirim'];
    $alamat_pengirim = $_POST['alamat_pengirim'];
    $isi = $_POST['isi'];
    $tanggal_surat = $_POST['tanggal_surat'];

    $sql = "UPDATE surat_masuk SET nomer_surat='$nomer_surat', id_kategori='$id_kategori', perihal='$perihal', nama_pengirim='$nama_pengirim', alamat_pengirim='$alamat_pengirim', isi='$isi', tanggal_surat='$tanggal_surat' WHERE no_urut='$id'";
    $insert = mysqli_query($koneksi, $sql);

    if(! $insert) {
        echo "<script>alert('Data Gagal Diperbarui'); window.location.href = './suratmasuk.php';</script>";
    } else {
        echo "<script>alert('Data Berhasil Diperbarui'); window.location = '../smartschool/suratmasuk.php'</script>";
    }
}
?>
