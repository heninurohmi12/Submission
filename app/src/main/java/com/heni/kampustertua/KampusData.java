package com.heni.kampustertua;

import java.util.ArrayList;

public class KampusData {
    private static String[] kampusNames = {
            "universitas al-karaouine",
            "universitas al azhar mesir",
            "universitas nizamiyah",
            "universitas bologna",
            "universitas paris",
            "universitas Oxford",
            "universitas montpelier",
            "universitas cambridge",
            "universitas salamanca",
            "universitas padua"

    };
    private static String[] kampusDetails = {
            "Universitas Al-Qarawiyyin atau Al-Karaouine (bahasa Arab: جامعة القرويين\u200E) (transliterasi dari nama lainnya meliputi Qarawiyin, Kairouyine, Kairaouine, Qairawiyin, Qaraouyine, Quaraouiyine, Quarawin, dan Qaraouiyn) adalah universitas pertama di dunia yang berlokasi di Fes, Maroko yang didirikan pada tahun 859.[1][4][5][6] Universitas ini telah dan terus menjadi salah satu pusat spiritual dan pendidikan terkemuka dari dunia Muslim.",
            "Universitas Al-Azhar (diucapkan \"Az-har\", bahasa Arab: جامعة الأزهر الشريف\u200E; Al-ʾAzhar al-Šyarīf, Al-Azhar Mulia), adalah salah satu pusat utama pendidikan sastra Arab dan pengkajian Islam Sunni di dunia[1] dan merupakan universitas pemberi gelar tertua kedua di dunia.[2] Universitas ini berhubungan dengan masjid Al-Azhar di wilayah Kairo Kuno.\n" +
                    "\n" +
                    "Mulanya universitas ini dibangun oleh Bani Fatimiyah yang menganut mazhab Syi'ah Ismailiyah, dan sebutan Al-Azhar mengambil dari nama Sayyidah Fatimah az-Zahra, putri Nabi Muhammad. Masjid ini dibangun sekitar tahun 970~972. Pelajaran dimulai di Al-Azhar pada Ramadan Oktober 975, ketika ketua Mahkamah Agung Abul Hasan Ali bin Al-Nu'man mulai mengajar dari buku \"Al-Ikhtisar\" mengenai topik yurisprudensi Syi'ah. Madrasah, tempat pendidikan agama, yang terhubung dengan masjid ini dibangun pada tahun 988. Belakangan, tempat ini menjadi sekolah bagi kaum Sunni menjelang abad pertengahan, dan terus terpelihara hingga saat ini.",
            "Madrasah Nizhamiyah (Arab: المدرسة النظامية, al-madrasah al-nizhamiyah) adalah sebuah sekolah tinggi di Baghdad zaman dahulu, yang didirikan oleh Wazir Nizham al-Mulk[1][2] pada masa pemerintahan Khalifah Abu Ja'far Abdullah al-Qa'im bi-Amrillah.[3] Sekolah tinggi ini amatlah masyhur, letaknya di daerah Al-Rusafa di kota Baghdad, yaitu pada sisi sebelah timur sungai Tigris.[2] Mulai dibangun pada bulan Dzulhijjah tahun 457 H/1065 M, sekolah ini mulai dijalankan pada 10 Dzulqaidah tahun 459 H,[1] dan bangunannya direnovasi dan diperbaiki pada tahun 504 H/1110 M.[2] Di sekolah ini dipelajari berbagai ilmu pengetahuan, dan bersama-sama Madrasah Mustansiriyah dianggap sebagai lembaga pendidikan yang paling ternama pada masa pemerintahan Abbasiyah.\n" +
                    "\n" +
                    "Lihat pula.",
            "Universitas Bologna (Italia: Alma Mater Studiorum Università di Bologna) merupakan sebuah universitas tertua Eropa dan Italia. Universitas ini terletak di Bologna, Italia. Didirikan pada tahun 1088. Universitas ini memiliki 13 museum.\n" +
                    "\n" +
                    "Universitas ini memiliki jumlah pelajar 95.771 orang pada tahun 2006.",
            "Universitas Paris (bahasa Prancis: Université de Paris) pertama kali muncul pada pertengahan kedua abad ke-12, tetapi pada 1970 diatur kembali sebagai 13 universitas otonomi (University of Paris I–XIII). Universitas ini seringkali disebut sebagai Sorbonne atau La Sorbonne karena institusi kolese (Collège de Sorbonne) yang didirikan pada 1257 oleh Robert de Sorbon, tetapi universitas tersebut lebih tua dan tidak pernah berpusat seluruhnya ke Sorbonne. Dari ketigabelas universitas tersebut, empat universitas pertamanya terletak di Sorbonne, dan tiga di antaranya menggunakan nama Sorbonne.",
            "Universitas Oxford adalah perguruan tinggi tertua berbahasa Inggris yang berlokasi di kota Oxford, Inggris.[5] Sejarah universitas ini dapat ditelusuri paling tidak mulai akhir abad ke-11, walaupun tanggal tepat pendiriannya tetap tak jelas. Menurut legenda, setelah pecahnya kerusuhan antara mahasiswa dan penduduk kota pada tahun 1209, beberapa akademisi Oxford melarikan diri ke timur laut, ke kota Cambridge, dan mendirikan Universitas Cambridge..[6] Kedua universitas \"kuno\" ini sejak itu telah saling bersaing satu sama lain, dan merupakan dua perguruan tinggi paling selektif di Britania Raya, yang sering dirujuk sebagai \"Oxbridge\".",
            "The University of Montpellier (French: Université de Montpellier) is a French public research university in Montpellier in south-east of France. Established in 1289, the University of Montpellier is one of the oldest universities in the world.\n" +
                    "\n" +
                    "The university was split into three universities during 45 years (the University of Montpellier 1, the University of Montpellier 2 and the Paul Valéry University Montpellier 3) between 1970 and 2015 when it was subsequently reunified by the merger of the former two,[2] with the latter, now named Paul Valéry University Montpellier, remaining a separate entity.",
            "Universitas Cambridge (bahasa Inggris: Cambridge University; bahasa Latin: Universitas Cantabrigiensis) adalah universitas tertua kedua dalam dunia bahasa Inggris, dengan persyaratan masuk yang paling ketat di Britania Raya, dan salah satu yang paling ketat di dunia.\n" +
                    "\n" +
                    "Catatan awal sudah tidak tersimpan lagi, tetapi universitas ini tumbuh dari sebuah perhimpunan sarjana di kota Cambridge, Cambridgeshire, Inggris, kemungkinan dibentuk pada tahun 1209 oleh sarjana yang kabur dari Universitas Oxford setelah bertengkar dengan penduduk kota tersebut.",
            "Pada 1218, Alfonso IX dari Castilia mendirikan universitas Kristen pertama di Iberia di kota ini, yaitu Universitas Salamanca, (gambar, kanan bawah), yang kini mendapatkan kembali gengsinya yang pernah hilang di bawah Franco, ketika Salamanca dijadikan kubu pertahanan para pendukungnya. Di bawah perlindungan Alfonso X yang terpelajar, kekayaan dan reputasinya menjadi sangat terkenal (1252-1282). Sekolah-sekolah hukum gereja dan hukum sipilnya menarik mahasiswa bahkan dari Universitas Paris dan Bologna. Pada puncak kemashyuran universitas ini, pada abad ke-16, satu dari lima penduduk Salamanca terdaftar sebagai mahasiswanya, dan kekayaan kota ini tergantung pada kekayaan universitas ini.",
            "Universitas Padua (Bahasa Italia:Università degli Studi di Padova, UNIPD) adalah universitas yang terletak di kota Padova, Italia. Universitas ini didirikan tahun 1222 sebagai sekolah hukum dan merupakan salah satu universitas terbaik pada masa Eropa modern.[2] Universitas ini masuk dalam jajaran universitas yang pertama kali didirikan di dunia dan kedua tertua di Italia. Tercatat 65.000 mahasiswa menempuh studi di universitas ini pada tahun 2003."
    };

    private static String[] Sejarah = {
            "Universitas ini terletak di Fes, Maroko. Awalnya, universitas ini adalah sebuah masjid yang didirikan pada tahun 859 oleh seorang wanita bernama Fatima al-Fihri. Pada perjalanannya, berkembang menjadi salah satu universitas terkemuka untuk bidang ilmu alam. Kemudian, pada tahun 1957, berkembang dengan dilengkapi bidang ilmu matematika, fisika, kimia, dan bahasa asing. Universitas ini pun mendapat rekor sebagai universitas tertua dari Guinness Book of World Records.\n" +
                    "\n.",
            "Universitas Al Azhar berada di Mesir, menempati urutan kedua sebagai universitas tertua yang didirikan pada 970-972. Al Azhar juga berfungsi sebagai pusat sastra dan literatur Islam Arab Sunni. Di universitas ini juga diajarkan berbagai bidang ilmu pengetahuan modern.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            "Universitas ini adalah satu dari sejumlah universitas yang didirikan oleh Khwaja Nizam Al-Mulk pada abad 11 di negara yang saat ini dikenal dengan Iran. Yang paling terkenal dari semua sekolah Nizamiyyah adalah Al-Nizamiyyah di Baghdad, didirikan pada 1065 di Dhu'l Qa'da dan beroperasi di Isfahan\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            "Universitas ini adalah lembaga pendidikan tinggi pertama yang didirikan di belahan dunia Barat pada tahun 1088, di Bologna, Italia. Universitas Bologna termasuk universitas yang berada di peringkat atas hingga masa perang dunia kedua. Pada masa itu, para pemimpin menempatkan universitas untuk menjalin hubungan dengan institusi-institusi di negara yang lebih maju untuk memperkuat filosofi pendidikannya. Hingga saat ini, Universitas Bologna masih dianggap sebagai salah satu universitas yang maju dalam hal sistem pendidikan di Eropa.\n" +
                    "\n.",
            "Tidak jelas siapa pendiri universitas ini. Namun, proses belajar mengajar di universitas ini telah berlangsung sejak 1096. Kemudian, terjadi reorganisasi menjadi 13 universitas otonomi pada tahun 1970. Seringkali disebut sebagai Sorbonne setelah College de Sorbonne yang didirikan sekitar tahun 1257. Universitas ini berkembang pada akhir abad 12 di wilayah Katedral Notre Dame sebagai sebuah pusat pembelajaran bidang seni, kedokteran, hukum, dan teologi.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            "Seperti halnya Universitas Paris, kapan tepatnya Universitas Oxford dibangun juga tidak jelas. Secara formal disebutkan dibangun pada tahun 1096. Universitas ini ini berkembang pesat sejak tahun 1167, saat Henry II melarang pelajar Inggris untuk belajar ke Universitas Paris. Universitas Oxford sempat ditutup dua kali. Pertama, pada tahun 1209 dan tahun 1355 karena kerusuahn St Scholastica. Saat ini, universitas berbahasa Inggris tertua ini, memiliki 38 jurusan dengan struktur internalnya masing-masing.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            "Universitas ini terletak di Montpelier, Prancis. Diyakini, usia universitas ini jauh lebih tua dari tanggal pendiriannya pada tahun 1150.\n.",
            "Universitas Cambridge dikenal sebagai universitas berbahasa Inggris tertua kedua setelah Oxford. Universitas ini dibentuk oleh para sarjana yang meninggalkan Universitas Oxford selama terjadi sengketa tahun 1209. Saat ini, Cambridge termasuk salah satu universitas top di dunia. Hingga tahun 2009, para alumni universitas ini telah memenangkan 85 penghargaan Nobel.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            "Universitas Salamanca terletak di Salamanca, Spanyol yang didirikan pada 1218 dan memperoleh gelar \"universitas\" oleh Paus Alexander IV pada tahun 1225. Awalnya, Universitas Salamanca didirikan oleh Raja Alfonso IX Leonese untuk memberikan kesempatan pada masyarakat Leonese untuk belajar, daripada pergi untuk belajar di Castile. Saat ini, Salamanca tetap menjadi universitas pilihan bagi siswa Spanyol yang ingin fokus pada humaniora dan studi bahasa.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\".",
            ".Universitas Padua adalah universitas tertua kedua di Italia setelah Universitas Bologna yang didirikan pada tahun 1222, ketika sekelompok mahasiswa dan profesor meninggalkan Universitas Bologna.\n" +
                    "\n" +
                    "Artikel ini telah tayang di Kompas.com dengan judul \"Ini Dia 10 Universitas Tertua di Dunia\"."
    };
    private static String[] Berdiri = {
            "Berdiri pada Tahun 859",
            "Berdiri pada Tahun 970-972",
            "Berdiri pada Tahun 1065",
            "Berdiri pada Tahun 1088",
            "Berdiri pada Tahun 1096",
            "Berdiri pada Tahun 1096",
            "Berdiri pada Tahun 1150",
            "Berdiri pada Tahun 1209",
            "Berdiri pada Tahun 1218",
            "Berdiri pada Tahun 1222"
    };
    private static int[] kampusImages = {
            R.drawable.alqara,
            R.drawable.alazhar,
            R.drawable.nazimyyah,
            R.drawable.bologna,
            R.drawable.paris,
            R.drawable.oxforf,
            R.drawable.montpelier,
            R.drawable.cambridge,
            R.drawable.salamanca,
            R.drawable.padua

    };

    static ArrayList<Kampus> getListData(){
        ArrayList<Kampus> list = new ArrayList<>();
        for(int position = 0; position < kampusNames.length; position++){
            Kampus kampus = new Kampus();
            kampus.setName(kampusNames[position]);
            kampus.setBerdiri(Berdiri[position]);
            kampus.setDetail(kampusDetails[position]);
            kampus.setPhoto(kampusImages[position]);
            kampus.setSejarah(Sejarah[position]);
            list.add(kampus);
        }
        return list;
    }
}
