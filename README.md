# ExercicioSingleton
Exemplos de Design Patterns - Singleton

Singleton significa, unico ou única

É um padrão de referencia para solução para criação de objetos que são utilizados ou compartilhados por varias instancias.

Ao utilizar Singleton temos mais controle sobre o acesso às propriedades e métodos de uma classe, e também reduzimos o consumo de memória desnecessário por utilizar várias instancias desnecessárias de uma classe.

Vantagens: não permite que um método que cria o mesmo objeto seja espalhado em varias partes do projeto;  
Impede que o mesmo objeto seja criado em vários códigos mas que so criaria a mesma coisa – exemplo tabuleiro de xadrez, um banco de dados único, um arquivo compartilhado.
Neste código está descrito a opção de Classe de um Tabuleiro de Damas. Não é necessário vários tabuleiros, apenas 1 para realizar o jogo. Desta forma, quando tentamos instanciar o tabuleiro mais de 1x, o mesmo irá retornar sempre o mesmo valor reservado na memória.
Deve-se levar em consideração que a redução do consumo de memória ocorre no contexto de não termos instâncias desnecessárias de uma classe que é utilizada com frequência por toda a aplicação.

Desvantagens: fere o Solid no SRP no principio de responsabilidade única, porque o Singleton ele privatiza o atributo e o método de criação do objeto e ao mesmo tempo ele gera o projeto para outras classes dentro dela mesma.

Algumas palavras reservadas no código temos:
Private que define que o atributo o método de acesso é privativo e unicamente feito pela classe onde está... seja no atributo, seja no metodo

Static que acompanha a palavra public static e significa que o método ele é operacionalizado dentro da classe

Synchronized que sincorinza todas as chamadas do método numa ordem para que não haja a criação de objetos ao mesmo tempo de varias chamadas ao mesmo tempo, ele ordena as requisioes do método

No código o método que vai ser requisitado por outros é o único publico.