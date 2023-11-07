| Nome do Padrão | Anti-Padrão | Definição do Padrão | Problema que Resolve | Exemplo de Aplicação |
| -------------  | ------------- |-------------------|----------------------|----------------------
| Strategy| Herança| É um padrão que tem como foco retirar toda herança que possa existir o que causa duplicação de código| Resolve os casos de Polimorfismo | Um Aluno que tem a possibilidade de Cursar dois cursos na mesma faculdade e ao mesmo tempo onde ele acaba podendo estudar pela manhã e a noite.
| Observer| Polimorfismo| Usado para estabelecer uma relação de dependência um-para-muitos entre objetos. Isso significa que quando um objeto (chamado de "sujeito" ou "observável") sofre uma alteração em seu estado, todos os objetos que dependem dele. |  Estabelecer uma comunicação eficiente entre objetos quando um objeto precisa notificar vários outros objetos sobre suas mudanças de estado. | Um Estoque onde ele possui produtos que podem estar se esgotando e ele avisa o Vendedor que o estoque está baixo.|
| Composite| Encapsulamento | Quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Esse padrão promove o baixo acoplamento entre objetos e é frequentemente usado para implementar a comunicação entre componentes. | Notificação | Um restaurante que possui um menu e que tem derivados de uma categoria |
| Facade | Encapsulamento | | | | 



