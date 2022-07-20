# <h2>E-TiceretDemo</h2>
E-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim ve kabul kriterleri aşağıda bulunmaktadır. Bu sisteme ait Java backend kodunu katmanlı mimari kullanarak oluşturdum ayrıca projede hiçbir ek paket kullanılmadı.
<ul>
<li>Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.

<li>Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
<li>Parola en az 6 karakterden oluşmalıdır.
<li>E-posta alanı e-posta formatında olmalıdır. (Regex kullanılarak yapıldı.)
<li>E-Posta daha önce kullanılmamış olmalıdır.
<li>Ad ve soyad en az iki karakterden oluşmalıdır.
<li>Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
<li>Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
<li>Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
<p>Sistemde dış servis entegrasyonu yapıldı adapter patterni kullanıldı.</p>
  <br>
  <br>
<li>Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)
<li>Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.
<li>E-posta ve parola zorunludur.
<li>Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
<ul>
