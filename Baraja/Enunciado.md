##Baraja

Una carta de la baraja española esta compuesta de un palo (ESPADAS, BASTOS, COPAS y OROS) y de un número (AS, DOS, TRES,
CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO y REY).
Define los palos y los números como dos tipos enumerados. Serán dos tipos enumerados complejos que, incluyen un método char
getAbreviatura() que devuelve un carácter que representa la versión abreviada del nombre de los elementos de la siguiente forma:
• Espadas (‘E’), Copas (‘C’), Bastos (‘B’) y Oros (‘O’)
• As (‘A’), dos (‘2’), tres (‘3’), cuatro (‘4’), cinco (‘5’), seis (‘6’), siete (‘7’), sota (‘S’), caballo (‘C’) y rey (‘R’)
Escribe una clase Carta que tenga dos propiedades, palo y número, usando los tipos enumerados definidos. La clase será inmutable,
el número y el palo pasarán por el constructor en ese orden.
El método toString() de la clase Carta tiene que devolver un String formado por dos caracteres resultantes de unir la abreviatura del
número y del palo. Así el cinco de espadas será representado por el String “5E”.
