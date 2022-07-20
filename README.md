# E-TiceretDemo
e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim ve kabul kriterleri aşağıda bulunmaktadır. Bu sisteme ait Java backend kodunu katmanlı mimari kullanarak oluşturdum ayrıca projede hiçbir ek paket kullanılmadı.
<ul>
<li>Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.<li>

<li>Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.<li>
<li>Parola en az 6 karakterden oluşmalıdır.<li>
<li>E-posta alanı e-posta formatında olmalıdır. (Regex kullanılarak yapıldı.)<li>
<li>E-Posta daha önce kullanılmamış olmalıdır.<li>
<li>Ad ve soyad en az iki karakterden oluşmalıdır.<li>
<li>Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)<li>
<li>Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)<li>
<li>Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.<li>
<p>Sistemde dış servis entegrasyonu yapıldı adapter patterni kullanıldı.</p>
<li>Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)<li>
<li>Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.<li>
<li>E-posta ve parola zorunludur.<li>
<li>Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.<li>
<ul>
