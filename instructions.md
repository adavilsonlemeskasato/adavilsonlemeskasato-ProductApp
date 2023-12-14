# Exercício CRUD em Java Usando HashMap

Este exercício é destinado a quem está reaprendendo Java. Vamos usar um `HashMap` como um banco de dados simulado para operações CRUD (Criar, Ler, Atualizar, Deletar).

## Exercício 1: Configurando o Projeto
1. **Criar um Novo Projeto Java**: Inicie configurando um novo projeto Java no seu IDE preferido (como Eclipse ou IntelliJ).
2. **Criar a Classe 'model'**: Esta classe deve ter pelo menos dois atributos, como `id` e `nome`. Inclua getters, setters e um construtor.
3. **Commitar em repositório remoto**: Enviar essas modificações para o repo do github e gerenciar o quadro do Jira de acordo com as modificações feitas.

## Exercício 2: Implementando Operações CRUD Usando HashMap
1. **Criar a Classe Principal**: Esta classe conterá o método `main`.
2. **Inicializar um HashMap**: Dentro da sua classe principal, inicialize um `HashMap<Integer, model>` para armazenar os produtos, onde a chave é o ID do produto.

## Exercício 3: Criar (Adicionar) Produtos
1. **Criar um Método para Adicionar Produtos**: Implemente um método que recebe um objeto `model` e o adiciona ao HashMap.
2. **Adicionar Produtos no Método Main**: No seu método `main`, crie vários objetos `model` e adicione-os ao HashMap usando seu método.

## Exercício 4: Ler (Exibir) Produtos
1. **Criar um Método para Exibir Produtos**: Implemente um método que imprime todos os produtos no HashMap.
2. **Testar a Funcionalidade de Leitura**: Chame este método no seu `main` para exibir todos os produtos.

## Exercício 5: Atualizar Produtos
1. **Criar um Método para Atualizar Produtos**: Este método deve receber um ID de produto e um novo objeto `model`, atualizando o produto existente no HashMap.
2. **Testar a Funcionalidade de Atualização**: Atualize um produto no `main` e exiba todos os produtos para verificar a atualização.

## Exercício 6: Deletar Produtos
1. **Criar um Método para Deletar Produtos**: Este método deve remover um produto do HashMap com base no ID do produto.
2. **Testar a Funcionalidade de Deleção**: Delete um produto no `main` e exiba todos os produtos para verificar a deleção.

## Exercício 7: Desafios Adicionais
1. **Tratamento de Erros**: Adicione tratamento de erros para casos como deletar um produto inexistente ou atualizar um ID desconhecido.
2. **Validação de Entrada**: Implemente validação para as entradas de produtos.
3. **Interface do Usuário**: Crie uma interface simples baseada em texto permitindo que os usuários escolham ações como adicionar, visualizar, atualizar ou deletar produtos.

## Passos Finais
- Teste cada funcionalidade cuidadosamente.
- Refatore seu código para melhorar a eficiência e legibilidade.
- Comente seu código para explicar sua lógica.

Este exercício não apenas refrescará habilidades básicas em Java, mas também fornecerá experiência prática com estruturas de dados comuns e operações CRUD.
