package com.example.modula

object ModuleData {
  private val moduleTitle = arrayOf(
    "Memulai Pemrograman Dengan Dart",
    "Belajar Dasar Pemrograman JavaScript",
    "Belajar Membuat Aplikasi Flutter Untuk Pemula",
    "Belajar Dasar Google Cloud",
    "What is data visualization?",
    "Memulai Pemrograman Dengan Kotlin",
    "Belajar Prinsip Pemrograman SOLID",
    "Apa itu Website?",
    "Apa itu SQL?",
    "Anatomi Website"
  )

  private val moduleArticle = arrayOf(
    """
      Pernahkah kalian mendengar atau bahkan mengembangkan aplikasi Flutter? Jika iya, berarti kalian sudah tahu bahwa Flutter ditulis menggunakan bahasa Dart. Jika belum, maka selamat berkenalan dengan Dart.
      
      Dart adalah bahasa pemrograman yang open source dan general purpose. Dart dikembangkan oleh Google dan ditujukan untuk membuat aplikasi multiplatform seperti mobile, desktop, dan web.
      
      Dart awalnya dikenalkan pada GOTO conference pada tahun 2011. Project ini didirikan oleh Lars Bak dan Kasper Lund dari Google, sampai akhirnya versi Dart 1.0 dirilis pada 14 November 2013. Bulan Agustus 2018, Dart 2.0 dirilis dengan perubahan bahasa seperti perubahan type system. 
      
      Jauh sebelum ada Flutter, Dart awalnya digunakan untuk membuat web yang ada di Google. Tujuan awal pembuatan Dart adalah untuk menggantikan JavaScript yang dinilai memiliki banyak kelemahan. Sejak saat itu, rilisnya Flutter SDK untuk pengembangan iOS, Android, dan web menjadi sorotan baru pada bahasa Dart.
    """.trimIndent(),
    """
      JavaScript adalah bahasa pemrograman tingkat tinggi yang pada awalnya dikembangkan untuk membuat website menjadi lebih “hidup”. Bersama dengan HTML dan CSS, JavaScript menjadi bahasa pemrograman paling populer untuk mengembangkan aplikasi berbasis web. Bahasa ini mampu memberikan logic ke dalam website, sehingga website tersebut memiliki fungsionalitas tambahan dan lebih interaktif.
      
      Awalnya JavaScript dibuat supaya dapat berjalan di lingkungan browser dan membuat website menjadi lebih interaktif. Namun, saat ini Anda sebagai developer dapat menggunakan bahasa pemrograman JavaScript di berbagai lingkungan pengembangan. Sehingga, tidak hanya sebatas browser/client, namun JavaScript juga bisa berjalan di server menggunakan Node.js.
    """.trimIndent(),
    """
      Flutter adalah SDK (Software Development Kit) yang dikembangkan oleh Google untuk membuat aplikasi yang bagus dan bisa berjalan pada berbagai platform. Flutter 2 yang merupakan versi terbaru memberikan dukungan pada Anda untuk membangun aplikasi pada sistem operasi Android, iOS, Web, Windows, Linux, dan MacOS. Dengan ini, Anda cukup sekali coding atau dikenal dengan single codebase. Flutter juga sudah digunakan oleh banyak developer maupun organisasi di seluruh dunia, selain itu Flutter bersifat open source.
      
      Flutter berbeda dari kebanyakan SDK Cross-platform lainnya untuk membuat aplikasi mobile. Untuk menarik widget, Flutter bukan menggunakan WebView maupun widget OEM, melainkan mesin rendering berkinerja tinggi. Flutter dapat digunakan bersamaan dengan aplikasi native yang sudah ada atau digunakan secara keseluruhan untuk aplikasi baru. 
    """.trimIndent(),
    """
      Pada zaman yang serba cepat dan canggih ini, waktu bagaikan uang, bukan? Sehingga apa pun yang dapat mempercepat sebuah proses bisnis akan menjadi perhatian lebih. Sehubungan dengan itu, apakah Anda tahu bahwa dunia teknologi kini perlahan beralih menggunakan teknologi cloud computing?
      
      Cloud Computing (komputasi awan) adalah layanan yang menyediakan sumber daya komputasi berdasarkan permintaan melalui internet. Ini dapat mempersingkat berbagai kebutuhan kita untuk mendapatkan, mengonfigurasi, atau mengelola sumber daya sendiri hanya dengan membayar layanan sesuai apa yang digunakan.
      
      Google Cloud Platform (GCP) menjadi salah satu penyedia cloud (cloud provider) yang dapat kita pilih karena memiliki berbagai layanan cloud computing yang sangat andal dan komprehensif. Kerennya lagi, setiap layanan GCP bisa saling terintegrasi satu sama lain dan didukung dengan jaringan terbesar di dunia milik Google.
      
      Dibandingkan dengan on-premise data center di mana kita harus membeli dan mengonfigurasi servernya agar dapat diakses oleh pengguna, cloud computing mengatasi masalah tersebut dengan menawarkan sumber daya komputasi sebagai layanan. Berbeda dari on-premise, sumber daya (resource) yang ditawarkan cloud computing dapat disesuaikan kapasitasnya dengan mudah (scalable) sesuai permintaan pengguna (on-demand). Anda bisa memanfaatkan berbagai layanan cloud computing sebagai solusi dalam mempercepat proses pertumbuhan dan perkembangan aplikasi bisnis Anda. 
      
      Bersamaan dengan itu, aplikasi Anda akan memperoleh banyak keuntungan, salah satunya adalah mampu tersedia secara global hanya dengan beberapa klik mouse saja. Tentu ini hal yang tak mungkin Anda dapatkan dengan mudah bila menggunakan infrastruktur tradisional seperti data center on-premise.
    """.trimIndent(),
    """
      Data visualization is the graphical representation of information and data. By using visual elements like charts, graphs, and maps, data visualization tools provide an accessible way to see and understand trends, outliers, and patterns in data. Additionally, it provides an excellent way for employees or business owners to present data to non-technical audiences without confusion.
      
      In the world of Big Data, data visualization tools and technologies are essential to analyze massive amounts of information and make data-driven decisions.
      
      Something as simple as presenting data in graphic format may seem to have no downsides. But sometimes data can be misrepresented or misinterpreted when placed in the wrong style of data visualization. When choosing to create a data visualization, it’s best to keep both the advantages and disadvantages in mind. 
      
      Our eyes are drawn to colors and patterns. We can quickly identify red from blue, and squares from circles. Our culture is visual, including everything from art and advertisements to TV and movies. Data visualization is another form of visual art that grabs our interest and keeps our eyes on the message. When we see a chart, we quickly see trends and outliers. If we can see something, we internalize it quickly. It’s storytelling with a purpose. If you’ve ever stared at a massive spreadsheet of data and couldn’t see a trend, you know how much more effective a visualization can be.
      
      While there are many advantages, some of the disadvantages may seem less obvious. For example, when viewing a visualization with many different datapoints, it’s easy to make an inaccurate assumption. Or sometimes the visualization is just designed wrong so that it’s biased or confusing.
    """.trimIndent(),
    """
      Pada tahun 2010 lalu JetBrains memulai sebuah proyek open-sources baru. Proyek ini merupakan sebuah bahasa pemrograman statically typed yang menargetkan JVM, Android, JavaScript dan Native [1]. Kotlin -nama sebuah pulau di Rusia- menjadi inspirasi oleh tim pengembang untuk ditetapkan sebagai nama bahasa pemrograman tersebut. Mungkin karena pulau tersebut terletak tidak jauh dari markas tim programer JetBrains, yaitu Saint Petersburg, Rusia. Bahasa Kotlin pertama kali dirilis pada bulan Februari 2016 dengan versi 1.0. Saat ini sudah mencapai versi 1.5.21 per rilis 14 Juli 2021. 
      
      Di balik kemajuan pesatnya Kotlin, terdapat pengembang - pengembang hebat dan kreatif dari JetBrains. Kotlin dikembangkan oleh lebih dari 50 developer pimpinan Andrey Breslav. Mereka semua terinspirasi dari bahasa pemrograman yang sudah ada seperti Java, Scala, JavaScript, C# dan juga Groovy. Apa yang membedakan? Salah satunya, JetBrains memastikan bahwa Kotlin sangat mudah dipelajari.
      
      Kotlin dapat digunakan untuk berbagai macam pengembangan aplikasi, baik itu server atau backend, website, maupun mobile Android. Bahkan saat ini tengah dikembangkan Kotlin/Native. Apa uniknya? Kotlin/Native memungkinkan developer untuk menggunakannya sebagai bahasa pemrograman dalam pengembangan aplikasi di platform lain seperti embedded system, desktop, macOS, dan iOS. Bahkan tak menutup kemungkinan Kotlin juga bisa digunakan untuk data science dan machine learning. Menarik, bukan?
      
      Dukungan tools untuk Kotlin , sangat kuat. Kita bisa dengan mudah menggunakan Kotlin pada IDE seperti IntelliJ IDEA, Android Studio, Eclipse, dan NetBeans. Anda pun bisa menggunakan perintah terminal untuk mengkompilasi dan menjalankan Kotlin. Begitu pula untuk build tools. Pada JVM kita bisa menggunakan Gradle, Maven, Ant, atau Kobalt. Tersedia juga beberapa build tools yang menargetkan JavaScript.
    """.trimIndent(),
    """
      Saat mengembangkan sebuah perangkat lunak, tentu kita harus mengetahui terlebih dahulu paradigma dalam dunia pemrograman. Mungkin kita sudah pernah mendengar beberapa paradigma seperti imperative, object-oriented, procedural, dan functional. Paradigma pemrograman itu apa sih? Paradigma pemrograman adalah gaya atau cara kita menulis program. Pada Modul ini kita akan membahas mengenai paradigma OOP (object-oriented programming). 
      
      Nah, sebelum membahas mengenai paradigma OOP, sebaiknya kita juga harus tahu mengenai hubungan antara prinsip S.O.L.I.D ini di dalam konsep OOP. Jadi prinsip S.O.L.I.D ini merupakan panduan bagi kita saat kita akan mengembangkan sebuah sistem dengan pendekatan OOP. Jika kita mengikuti prinsip-prinsip ini kita dapat membuat sebuah sistem yang mudah kita gunakan dan kembangkan kembali, kokoh, dan tidak rapuh. 
      
      Pada pemrograman dengan menggunakan pendekatan OOP kita akan menemui beberapa istilah atau pembahasan seperti Class, Attribute dan Function. Perlu kita ingat, bahwa setiap bahasa pemrograman memiliki istilah-istilah tersendiri . Makna-makna istilah tersebut hampir sama atau bisa sangat berbeda. Seperti contohnya, properti atau atribut yang memiliki makna yang sama meskipun tersendiri namanya berbeda. Biasanya programmer lebih sering menggunakan atribut untuk istilah yang berkaitan dengan hal yang mengarah ke mekanisme atau proses yang dilakukan oleh objek dan menggunakan istilah property untuk mendeskripsikan karakteristik dari sebuah objek.
      
      Mengapa Object Oriented Programming? OOP (Object Oriented Programming) masih merupakan salah satu paradigma atau teknik pemrograman yang populer dalam pengembangan aplikasi. Dengan paradigma OOP kita dapat dengan mudah memvisualisasikan kode karena OOP sendiri mirip dengan skenario kehidupan nyata. Dalam penerapan OOP kita menggabungkan kumpulan-kumpulan fungsi atau atribut yang memiliki kesamaan dalam sebuah unit yang kita sebut sebagai objek.
    """.trimIndent(),
    """
      Website adalah sebuah halaman yang menampilkan informasi berupa teks atau gambar. Website dapat diakses melalui internet menggunakan browser. Website ini unik karena tiap halaman dapat saling terhubung dengan menggunakan hypertext links. Umumnya sebuah website memuat informasi yang disediakan secara perorangan, kelompok, atau organisasi. Semua informasi yang tersedia pada halaman website disimpan pada server.
      
      Website sudah berkembang sangat pesat. Sekarang, website digunakan tidak hanya untuk media berbagi informasi atau berita. Layaknya sebuah aplikasi pada komputer dan handphone kita, website dapat digunakan untuk komunikasi secara real-time, mendengarkan sebuah lagu, bahkan photo editing sekarang dapat dilakukan pada sebuah website.
      
      Website sendiri merupakan teknologi yang sudah ada sejak 30 tahun silam. Tim Berners-Lee seorang ilmuwan Inggris menemukan World Wide Web (WWW) pada tahun 1989 ketika ia bekerja di CERN (Conseil Européen pour la Recherche Nucléaire). Web awalnya dibuat dan dikembangkan untuk memenuhi permintaan dalam berbagi informasi secara otomatis antar ilmuwan di universitas dan lembaga di seluruh dunia. Web pertama di CERN didedikasikan sebagai web pertama di dunia. Selain itu, pada tahun 2013 CERN merilis “a project to restore this first ever website” (Linknya info.cern.ch) untuk mengabadikan website pertama di dunia. Thank you CERN! Thank you Tim Berners-Lee!
    """.trimIndent(),
    """
      Setiap bahasa pemrograman memiliki fungsi yang berbeda. Begitu pula dengan structured query language (SQL). Dikutip dari Dataquest, SQL adalah bahasa query yang dirancang untuk pengambilan informasi tertentu dari database.
      
      Awalnya, SQL muncul pada 1970 dengan nama structured english query language (SEQUEL). Kemudian, pada 1986, IBM menggunakan SEQUEL dalam berbagai proyek database mereka. Tak lama, nama SEQUEL pun diubah menjadi SQL agar lebih mudah dieja. Sejak saat itu, SQL menjadi semakin populer dalam pengolahan data dan database.
      
      Meskipun sudah ada sejak puluhan tahun silam, nyatanya kini SQL masih menjadi salah satu bahasa pemrograman yang paling banyak digunakan. Alasannya, sebagian besar perusahaan menyimpan datanya dalam sebuah database.
    """.trimIndent(),
    """
      Kita terbiasa dengan tampilan website yang nampak pada browser. Namun apakah kalian tahu bagaimana website dapat tampil demikian? Terdapat 3 (tiga) fondasi penting dalam membuat website. Pertama adalah HTML, salah satu markup language yang digunakan untuk membuat struktur dan menampilkan konten pada World Wide Web (Website). CSS dan JavaScript merupakan fondasi lainnya yang digunakan untuk mempercantik dan menjadikan website lebih dinamis dan interaktif. 
      
      Sama seperti halnya tubuh manusia yang disusun dari kerangka tulang, HTML pada website berperan sebagai kerangka dasar yang digunakan dalam menampilkan visual pada website. Tapi jika hanya sebatas kerangka, seorang manusia akan terlihat menyeramkan dan aneh bukan? Maka dari itu untuk mempercantik tampilannya kita membutuhkan sebuah kulit. Di sinilah peran CSS. Setelah memiliki kulit dan nampak cantik, selanjutnya kita membutuhkan sebuah otak dan otot agar seorang manusia dapat dinamis dan berinteraksi. Dalam website JavaScript-lah yang berperan dalam membuat website yang dinamis dan interaktif.
    """.trimIndent()
  )

  private val moduleCategory = arrayOf(
    "Multi-Platform App",
    "Front-End Web / Back-End",
    "Multi-Platform App",
    "Back-End",
    "Data Analytics",
    "Android App",
    "Programming Paradigm",
    "Front-End Web",
    "Database",
    "Front-End Web"
  )

  private val moduleImage = intArrayOf(
    R.drawable.dart,
    R.drawable.javascript,
    R.drawable.flutter,
    R.drawable.google_cloud,
    R.drawable.data_visualization,
    R.drawable.kotlin,
    R.drawable.solid_principles,
    R.drawable.ilustrasi_website,
    R.drawable.sql,
    R.drawable.ilustrasi_anatomi_web
  )

  val moduleList: ArrayList<Module>
    get() {
      val list = arrayListOf<Module>()

      for (index in moduleTitle.indices) {
        val module = Module()

        module.title = moduleTitle[index]
        module.article = moduleArticle[index]
        module.category = moduleCategory[index]
        module.image = moduleImage[index]
        list.add(module)
      }

      return list
    }
}