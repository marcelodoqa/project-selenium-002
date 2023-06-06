# language: pt

  Funcionalidade: Deve fazer login corretamente

    Cenário: Fazer login com dados validos
      Dado que estou na pagina de login
      Quando insiro um email valido
      E insiro uma senha valida
      E clico em entrar
      Então devo redirecionado para a pagina inicial
      E receber um aviso de bem vindo

    Cenário: Fazer login com email invalido
      Dado que estou na pagina de login
      Quando insiro um email invalido
      E insiro uma senha valida
      E clico em entrar
      Então devo receber um aviso de Error

    Cenário:  Fazer login com senha inválida
      Dado que estou na pagina de login
      Quando insiro um email valido
      E insiro uma senha invalida
      E clico em entrar
      Então devo receber um aviso de Error

    Cenário: Fazer login com campo email e senha vazios
      Dado que estou na pagina de login
      Quando nao preencho nenhum campo
      E clico em entrar
      Então devo receber um aviso de Error2


