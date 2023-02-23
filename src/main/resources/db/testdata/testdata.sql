INSERT INTO
    writer (first_name, last_name, genre)
VALUES
    ('Andrzej', 'Sapkowski', 'fantasy'),
    ('Jarosław', 'Grzędowicz', 'fantasy'),
    ('Robert', 'Jordan', 'fantasy'),
    ('Joanne', 'Rowling', 'fantasy'),
    ('John', 'Tolkien', 'fantasy');

INSERT INTO
    book (title, publisher, description, pages, writer_id)
VALUES
    ('Pan Lodowego Ogrodu - Księga IV', 'Fabryka Słów', 'Pan Lodowego Ogrodu – finałowy, czwarty tom cyklu, ozdobionego kompletem nagród przyznawanych w polskiej fantastyce.', 880, 2),
    ('Pan Lodowego Ogrodu - księga I', 'Fabryka Słów', 'Władza uzależnia, szczególnie w połączeniu z magią. Wyobraź sobie, że stałeś się bogiem – ktoś miałby cię tego stanu pozbawić?', 660, 2),
    ('Pan Lodowego Ogrodu - księga II', 'Fabryka Słów','Mówią, że zimna mgła żyje. Inni uważają, że to oddech bogów albo brama zaświatów.', 625,1),
    ('Miecz Przeznaczenia', 'Nowa', 'Wiedźmiński kodeks stawia tę sprawę w sposób jednoznaczny: wiedźminowi smoka zabijać się nie godzi.', 400,1),
    ('Oko Świata', 'Nowa', 'Pierwsza książka cyklu o Wieku Odkupienia. Wiodącymi bohaterami są Rand al’Thor i jego przyjaciele.', 624, 3),
    ('Wielka Polowanie', 'Nowa', 'Druga część cyklu. Rand i jego przyjaciele wyruszają w wielką wyprawę w poszukiwaniu Miecza Lewiatana.', 672, 3),
    ('Smok Odrodzony', 'Nowa', 'Trzecia część cyklu. Rand al’Thor staje się coraz bardziej świadomy swojej roli w walce z Siłami Ciemności.', 864, 3),
    ('Wschodzący cień', 'Nowa', 'Czwarta część cyklu. Rand musi się zmierzyć z wieloma przeciwnościami, by zrealizować swoje powołanie.', 944, 3),
    ('Ognie Niebios', 'Nowa', 'Piąta część cyklu. Rand al’Thor i jego kompani odkrywają swoje przeznaczenie i próbują je zrealizować.', 896, 3),
    ('Harry Potter i Komnata Tajemnic', 'Media Rodzina', 'Książka opowiada o przygodach młodego czarodzieja, Harry Pottera, w pierwszym roku nauki w Hogwarcie', 256, 1),
    ('Harry Potter i Więzień Azkabanu', 'Media Rodzina', 'Książka opowiada o kontynuacji przygód Harry Pottera w drugim roku pobytu w Hogwarcie', 304, 4),
    ('Harry Potter i Czara Ognia', 'Media Rodzina', 'Książka opowiada o trzecich przygodach Harry Pottera w trzecim roku nauki w Hogwarcie', 446, 4),
    ('Harry Potter i Zakon Feniksa', 'Media Rodzina', 'Książka opowiada o czwartych przygodach Harry Pottera w czwartym roku pobytu w Hogwarcie', 608, 4),
    ('Harry Potter i Książę Półksiężyca', 'Media Rodzina', 'Książka opowiada o piątych przygodach Harry Pottera w piątym roku nauki w Hogwarcie', 738, 4),
    ('Harry Potter i Insygnia Śmierci', 'Media Rodzina', 'Książka opowiada o szóstych przygodach Harry Pottera w szóstym roku pobytu w Hogwarcie', 870, 4),
    ('Hobbit', 'Allen & Unwin', 'Opowieść o Bilbo Bagginsie, przygodzie i bitwie o Śródziemie.', 310, 5),
    ('Władca Pierścieni', 'Allen & Unwin', 'Powieść fantasy o hobbitach, elfach i ludziach walczących o pokój i bezpieczeństwo Śródziemnego Świata.', 680,5),
    ('Silmarillion', 'Allen & Unwin', 'Antologia starożytnych opowieści o stworzeniu Śródziemnego Świata i jego mieszkańcach.', 468, 5);