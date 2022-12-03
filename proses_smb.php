<?php
if(isset($_POST['nomer_surat']) && $_POST['nomer_surat']) {

    include 'db_connect.php';

    $nomer_surat = $_POST['nomer_surat'];
    $id_kategori = $_POST['id_kategori'];
    $perihal = $_POST['perihal'];
    $nama_pengirim = $_POST['nama_pengirim'];
    $alamat_pengirim = $_POST['alamat_pengirim'];
    $isi = $_POST['isi'];
    $tanggal_surat = $_POST['tanggal_surat'];
    $lokasi_file = $_FILES['dokumen']['tmp_name'];
    $nama_file   = $_FILES['dokumen']['name'];
    // Tentukan folder untuk menyimpan file
    $folder = "files/$nama_file";
    if (move_uploaded_file($lokasi_file,"$folder")){
    echo "Nama File : <b>$nama_file</b> sukses di upload";
    }

    $sql = "INSERT INTO surat_masuk(nomer_surat, id_kategori, perihal, nama_pengirim, alamat_pengirim, isi, tanggal_surat, dokumen) VALUES ('$nomer_surat', '$id_kategori', '$perihal', '$nama_pengirim', '$alamat_pengirim', '$isi', '$tanggal_surat', '$nama_file')";
    $insert = mysqli_query($koneksi, $sql);

    if(! $insert) {
        echo "<script>alert('Input Data Gagal'); window.location.href = './suratmasuk_baru.php';</script>";
    } else {
        echo "<script>alert('Input Data Berhasil'); window.location = '../smartschool/suratmasuk.php'</script>";
    }
}
?>
