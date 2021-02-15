-- 1 Nisan 2007 tarihten sonra ödeme yapan müşterileri listeleyen sorgu
SELECT c.customer_id, c.first_name, c.last_name, p.payment_date
FROM customer c
INNER JOIN payment p 
ON c.customer_id = p.customer_id
WHERE payment_date>'2007-04-01';



-- Aksiyon ve Animasyon kategorisindeki filmlerin çıkış tarihlerini, başlığını ve kategorisini listeleyen sorgu
SELECT f.release_year, f.title, ca.name
FROM film f
INNER JOIN film_category fc 
ON fc.film_id = f.film_id
INNER JOIN category ca
ON ca.category_id = fc.category_id
WHERE ca.category_id = 1 OR ca.category_id = 2; 



-- Film kiralama ödemesini en yakın tarihte yapan müşterilerin adı, soyadını ve ödeme tarihini listeleyen sorgu
SELECT c.first_name, c.last_name, p.payment_date
FROM customer c
INNER JOIN payment p
ON p.customer_id = c.customer_id
WHERE p.payment_date IN 
(SELECT payment_date FROM payment
WHERE payment_date > '2007-05-13' 
ORDER BY payment_date DESC);



-- P ve P'den sonraki harflerle başlayan ve stokta bulunmayan filmleri listeleyen sorgu
SELECT * FROM film f
WHERE f.film_id NOT IN 
(SELECT i.film_id FROM inventory i) 
AND (f.title LIKE 'P%' OR f.title LIKE 'Q%' OR f.title LIKE 'R%' OR f.title LIKE 'S%' OR f.title LIKE 'T%' 
OR f.title LIKE 'U%' OR f.title LIKE 'V%' OR f.title LIKE 'W%' OR f.title LIKE 'X%' OR f.title LIKE 'Y%' OR f.title LIKE 'Z%');

--Bu sorunun alternatif çözümü, (bir arkadaşla beraber araştırdık):
SELECT * FROM film f
WHERE f.film_id NOT IN 
(SELECT i.film_id FROM inventory i) 
AND f.title ~ E'^[p-zP-Z].*';



--B harfi ile başlayan müşterileri, film kiralamak için ödedikleri toplam miktarları ile birlikte listeleyen sorgu
SELECT c.customer_id AS Kullanıcı_IDsi, c.first_name AS AD, round(SUM(p.amount), 2) AS Toplam_Ödeme_Miktarı
FROM payment p 
INNER JOIN customer c
ON c.customer_id = p.customer_id
WHERE c.first_name LIKE 'B%'
GROUP BY c.customer_id, c.first_name
ORDER BY c.first_name;
