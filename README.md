# Sistema de Controle de Acesso

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento na linguagem Java.

## :zap: Descrição
  Desenvolvi um sistema de controle de acesso em Java. 

  Esse sistema apresenta um menu, no console, indicando a opção de acessar o estabelecimento e a opção de finalizar o sistema e mostrar um relatório.
  
  ### :memo: **O menu tem o seguinte formato:**
  ```
    Entre com o número correspondente à opção desejada:
    1 - Acessar o estabelecimento  --> Essa etapa se repete até que a opção nº 2 seja escolhida.
    2 - Finalizar sistema e mostrar relatório  --> O laço de repetição se encerra e o relatório é impresso no console. 
  ```
  
  :pushpin: **Se a pessoa usuária entrar com o valor 1**, retornará, no console, a mensagem:
  ```
  Entre com a idade:
  ```
  * Depois de inserir a idade da pessoa cliente e pressionar enter, **aparecerá uma das mensagens listadas abaixo**:
   ```
    - Pessoa cliente menor de idade, catraca liberada!
    - Pessoa adulta, catraca liberada!
    - Pessoa adulta a partir de 50, catraca liberada!
   ```

  :pushpin: **Se a pessoa usuária entrar com o valor 2**, o sistema apresenta um relatório.

  O relatório contém o total, o cálculo da porcentagem das pessoas que acessaram o estabelecimento, e o número de pessoas: 
 
  - Menores de 18 anos,
  - Adultas (entre 18 e 49 anos), e
  - A partir de 50 anos.

  ### :white_check_mark: **Exemplo de saída do relatório:**
   ```
   ----- Quantidade ----- 
   menores: 20
   adultas: 150 
   a partir de 50: 30

   ----- Percentual ----- 
   menores: 10.0% 
   adultas: 75.0% 
   a partir de 50: 15.0%

   TOTAL: 200 
   ``` 
### A imagem abaixo mostra o fluxo que o programa seguiu:
![Fluxo-controle-de-acesso](https://github.com/analuisams99/controle-de-acesso-java/blob/main/img/controle-acesso.png)


## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/controle-de-acesso-java.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd controle-de-acesso-java`

  3. Instale as dependências:
    
     `mvn install`

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `mvn test`
      
    Os códigos de testes, da pasta src/test/java/com/trybe/acc/java/controledeacesso, foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
