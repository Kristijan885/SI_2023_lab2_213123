# Kristijan Panchevski 213123
2.Control Flow Graph <br>![enter image description here](https://github.com/Kristijan885/SI_2023_lab2_213123/blob/master/Screenshot%202023-05-31%20at%2018.34.16.png?raw=true)<br>3. Цикломатска Комплексност: M = E - N + 2P M = 36 - 27 + 2<br>
М = 11 <br>
M - Циколоматска комплексност, E - број на ребра, N - број на јазли<br>
4.5. Every Branch and Multiple Condition <br>![enter image description here](https://github.com/Kristijan885/SI_2023_lab2_213123/blob/master/Screenshot%202023-05-31%20at%2021.40.58.png?raw=true)<br>
1. Кога user-от е null, функцијата ќе јави грешка и ќе заврши извршувањето со порака до 23. Во овој случај, е потребно да се обезбеди вредност за user-от, бидејќи null вредноста не е прифатлива. -> 1 -> 2 -> 23

2. Доколку има празно место за password, email-от не содржи @ или ., и username-от е null, ќе се јави грешка и извршувањето ќе заврши со порака до 23. За правилно функционирање, потребно е да се пополни password-от, да се додадат @ и . во email-от и да се внесе вредност за username-от. -> 1 -> 3 -> 4 -> 5 -> 14 -> 16 -> 17 -> 22 -> 23

3. Ако password-от не содржи специјални карактери, email-от содржи @ и ., username-от не е null и нема празно место во password-от, ќе се јави грешка и извршувањето ќе заврши со порака до 23. За да се избегне оваа грешка, потребно е password-от да содржи специјални карактери, email-от да содржи @ и ., и да се внесе вредност за username-от. -> 1 -> 3 -> 5 -> 6 -> 7.1 -> 7.2 -> 8 -> 9 -> 10 -> 11 -> 12 -> 7.3 -> 7.2 -> 13 -> 14 -> 16 -> 17 -> 18.1 -> 18.2 -> 19 -> 20 -> 23

4. Кога password-от го содржи username-от, username-от не е null, а email-от содржи @ и ., ќе се јави грешка и извршувањето ќе заврши со порака до 23. За правилно функционирање, потребно е да се обезбеди различна вредност за password-от и username-от, и да се внесе валидна email адреса. -> 1 -> 3 -> 5 -> 6 -> 7.1 -> 7.2 -> 8 -> 9 -> 11 -> 7.3 -> 7.2 -> 13 -> 14 -> 15 -> 23

5. Ако password-от содржи специјални карактери, ќе се врати успешен резултат и извршувањето ќе продолжи нормално. Во овој случај, password-от треба да содржи специјални карактери за успешна автентикација. -> 1 -> 3 -> 5 -> 6 -> 7.1 -> 7.2 -> 8 -> 9 -> 11 -> 7.3 -> 7.2 -> 13 -> 14 -> 16 -> 17 -> 18.1 -> 18.2 -> 19 -> 18.3 -> 18.2 -> 21 -> 22 -> 23

Во сите случаи, функцијата ќе заврши со порака до 23 за завршено извршување.

Извинете за непрецизноста. Еве го преработениот текст со замена на буквите со соодветните броеви според Вашата прашање:

Доколку корисникот е null објект, се наоѓаме во случајот T-X-X, каде првиот услов е точен и другите не се проверуваат. Исполнува се гранката 1-2.

Доколку корисникот не е null објект и не внесеме лозинка за него, се наоѓаме во случајот F-T-X, каде се исполнува гранката 1-2.

Доколку корисникот не е null објект и внесеме лозинка без е-маил, се наоѓаме во случајот F-F-T, каде се исполнува гранката 1-2.

Ако за сите 3 полиња внесеме податоци, тогаш се наоѓаме во случајот F-F-F и се исполнува гранката 1-3.
<br>
