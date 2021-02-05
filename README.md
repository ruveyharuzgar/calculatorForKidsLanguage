# Çocuklar İçin Türkçe Programlama Dili
###  4 İşlemli Hesap Makinesi

- Gereksinimleri ve amacımızı düşündüğümüz de, burda karşıya geçirilmek istenen temel düşüncemi  açıklamak istiyorum.Çocukların ya da yazılıma yeni başlamış bireylerin programlama dillerini kavrayabilmesi ve karmaşık gelen öğrenme paradoksundan çıkartıp daha basite indirgeyebileceğimizi göstermekteyim.Genel de Türkçe kaynağın az olması bir sorun teşkil ederken, bu projede de bunun önüne geçebilmeyi hedefliyorum.Nasıl çalıştığına gelicek olursak;
<br> </br>


<i> Öncelikle main bloğumuza bakalım, burda Java diline ait bir yazdır satırı yok.Herhangi bir class referansı alınmıyor.Çağırdığımız fonksiyonlara baktığımız da hepsinin türkçe kelimeler olduğunu görüyoruz. Bi bakıma aslında bu dışardan bakılınca çok anlaşılır.Ne yapılıyor sorusunun cevabını rahatlıkla alabiliriz.İşte burda ki tüm amacımız buydu.İstenilen iş= o işin classı+ işlem adımı ;
</i>

![mainn](https://user-images.githubusercontent.com/65314278/107028955-4e990e00-67bf-11eb-90c0-58e07e7211e8.png)

<i> Main bloğumuzda da çağırdığımız DeğiskenOlustur classını çağırdığımız da anlaşılırlığı kaybetmemek adına içerisine tanımladığımız methodlarında bağımlı olması gerekiyordu.Çocuklar için olduğunu unutmayalım.Class + method mantığında çalışırken nesneleri/referansları almamayı tercih etmiştik.Bunu da her method ve classlar da göreceğiniz üzere <strong> "static" </strong> anahtar sözcüğü ile sağlıyoruz.İşlemimizin değer tipini türkçe olarak alıp çağırabilmek için oluşturulan bu adımları örnekleriyle de yukarda gördük.
</i> 

![degiskenolustur](https://user-images.githubusercontent.com/65314278/107028962-50fb6800-67bf-11eb-8e4b-0bf1f29200e3.png)

<i> İşlemleri yapacağımız class temizlik açısından önemliydi.Burda Matematikselİslemler classını çağırdığımızda yapabileceğimiz 4 işlemi kodluyoruz. Oluşturduğumuz bu işlem methodlarını overload edip 2 veya 3 elemanla girişlerde sorun yaratmaması için garantiliyoruz.Daha sonra işlemleri yazıp sonucu return ettiriyoruz.
</i>

![matematikselislemler](https://user-images.githubusercontent.com/65314278/107028972-53f65880-67bf-11eb-8779-6d7b36c92317.png)

<i> Bu classımızda da temel görev, yazdırma ve istenilirse yapılan işlemleri bir depoda (.txt/.xlsx/.csv) "geçmiş" olarak kaydedebilmek adına oluşturuldu.Küçük bir update ile mevcut hale getirilebilir, düzeninde yazıldı.Her programcının ilk öğrendiği ve yazdığı ("Hello world!") çıktısını, Java da System.out.print(); satırı ile yazabiliyorduk.Bir çocuk programcı için ise bunu hiç ingilizce kelime kullanmayarak bir method ile yazdırmak istedim.Sadece her class ve method ile yaptığımız adımları burda da yazdırmak için yapabilir! Bu methodu çağırdığında her şeyi yazdırabilsin diye her değer tipimiz için aynı isim de bir method oluşturup hatanın önüne geçtim.Artık her şey çok daha basit.
</i>
![sistemAraclari](https://user-images.githubusercontent.com/65314278/107033317-2bbe2800-67c6-11eb-8eb6-3bcbda3c3fcf.png)

![çıktı](https://user-images.githubusercontent.com/65314278/107034272-886e1280-67c7-11eb-8e58-769e1d9c45bd.png)
