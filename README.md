# ExercicioSingleton
Exemplos de Design Patterns - Singleton

Singleton é padrão dentro da caixa de Padroes Criacionais

Ao utilizar Singleton temos mais controle sobre o acesso às propriedades e métodos de uma classe, e também reduzimos o consumo de memória desnecessário por utilizar várias instancias desnecessárias de uma classe.

Neste código está descrito a opção de Classe de um Tabuleiro de Damas. Não é necessário vários tabuleiros, apenas 1 para realizar o jogo. Desta forma, quando tentamos instanciar o tabuleiro mais de 1x, o mesmo irá retornar sempre o mesmo valor reservado na memória.

Deve-se levar em consideração que a redução do consumo de memória ocorre no contexto de não termos instâncias desnecessárias de uma classe que é utilizada com frequência por toda a aplicação.

Onde é recomendada a utilização de Singleton?
Singleton deve ser utilizado com cautela, pois nem sempre é útil ter apenas uma instância de uma classe sendo compartilhada por toda a aplicação.

Sobre Design Patterns, não existe bala de prata. Devemos sempre analisar cada cenário antes de escolhermos utilizar ou não um padrão de projeto.
Com o singleton, cabe uma análise especial, pois uma implementação errada dele pode levar sua aplicação a compartilhar informações entre objetos que não deveriam ser compartilhadas.
Sempre tenha em mente que conhecer bem os Design Patterns  e suas aplicações pode te economizar algumas horas de desenvolvimento.
Portanto, entenda bem o cenário onde você pretende utilizá-lo e, principalmente, entenda bem como ele funciona. Desenvolva a suas próprias provas de conceito e analise o resultado obtido antes de mais nada.
