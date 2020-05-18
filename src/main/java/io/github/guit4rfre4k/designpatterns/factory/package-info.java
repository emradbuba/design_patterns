package io.github.guit4rfre4k.designpatterns.factory;

/**
 * Fabryka:
 * Client chce korzystać z jakiegoś produktu. I spoko, można mu podać konkretną instancję np w konstruktorze i heja - niech sobie korzysta. Co jeśli jednak taki produktów może być kilka? Ano może warto Product potraktować jako interface i wprowadzać do klienta tylko instacje polimorficzne w zależności od potrzeb. No spoko, też zadziała a dodatkowo klient będzie otwarty na nowe implementacje bez konieczności zmainy kodu.
 * Kiedy wrzucić fabrykę? Najlepiej jeśli po prostu proces tworzenia różnych produktów jest dość skomplikowany i wymaga sporej konfiguracji. Może wówczas warto stworzyć klasę która posiada ileś tak statycznych metod z których każda tworzy i zwraca jakąś konkretną implementację produktu pod wspólnym interfacem. Też spoko, bo client dostaje to co chce w zależności od potrzeb i tworzy mu to fabryka - klient nie musi zatem nic konfigurować tylko mówi co chce i to dostaje. I to wszytko w jednej linijce kodu. Można także stworzyć dla każdej fabryki oddziele implementacje. Po co? Żeby client nie musiał nawet decydować o tym jakiej konkrentej fabryki użyć (wcześniej musiał zdecydować się na jakąś implementację wywołując konkretną metodę testową) tylko żeby dostawał ją pod wspólnym interfacem - wtedy wie, że dostanie jakąś fabrykę która da mu to co potrzeba a co dokładnie to go nie obchodzi. W takiej sytuacji jakakolwiek nowa fabryka nie, zmiana logiki w wyborze fabryki itp nie wpływa na kod clienta.
 *
 * Kiedy fabryka abstakcyjna?
 * Kiedy na przykład nie mamy już do czynienia z jednym produktem tylko z jakąś rodziną produktów. Fabryka nie zwraca nam już zatem jakiegoś Productu a już tylko na przykład kilka różnych produktów (np w przypadku fabryki części samochodowych koła, drzwi, szyby, kierownicę, hamulce,... ) w postaci listy czy też po prostu osobnej metody dla każdej części. Generalnie każda część jest zwracana poprzed interface i to powoduje, że każda fabryka abstrakcyjna może zwracać części z konkrentnej rodziny produktów (np częście do Forda Mondeo). Klient nie po prostu dostaje części i gówno go obchodzi skąd i jak:
 * CarFactory factory = new LamborginiCarFactory(); // lub cokolwiek innego
 * factory.getDoor();
 * facotry.getOtherPart();
 */
