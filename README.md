# AppMarvel - Nicolas e Luan 3°DS
<br/>

<div align="center">
<a data-flickr-embed="true" href="https://www.flickr.com/photos/198228384@N04/52860914152/in/dateposted-public/" title="download"><img src="https://live.staticflickr.com/65535/52860914152_7cf6cc1ff7_n.jpg" width="320" height="128" alt="download"/></a>

  </div>
  <br/>
  
  
  <div text align="justify">
  

Protótipo: https://ibb.co/RDMBJtJ;

Diagrama de Classe: https://ibb.co/Qpgbz9v;

Diagrama ER: https://ibb.co/4Wvbz3m;

Mapa de Navegação: https://ibb.co/v1PBZyR;

O aplicativo fala sobre o Universo Marvel, é uma plataforma para os fãs da Marvel que desejam ter acesso a informações sobre seus personagens, quadrinhos e histórias favoritas. O aplicativo contém diversas funcionalidades, incluindo uma tela de loading com o logo da Marvel quando aberto.

No menu principal, existem quatro botões que levam a quatro telas distintas. A primeira tela é a de Personagens, nela possui uma caixa de texto e um botão de pesquisa para encontrar resultados pesquisados. 
  
A segunda tela é a de Quiz, que é um jogo de perguntas e respostas sobre o universo Marvel. O usuário pode testar seus conhecimentos sobre a história da Marvel respondendo as perguntas. Ao final, o usuário receberá um resultado baseado no número de perguntas respondidas corretamente.
  
A terceira tela é a de Quadrinhos, nela também possui uma caixa de texto e um botão de pesquisa para encontrar resultados pesquisados.

A Quarta tela é a de favoritos, que exibirá todos os itens salvos em uma lista para que os usuários possam revisá-los facilmente.   
  
Nas telas de Personagem e Quadrinho, após selecionar um item, o usuário será levado a uma nova tela que contém informações detalhadas sobre o item selecionado. Para Personagem, a tela mostrará uma miniatura do personagem, seu nome, descrição e um espaço para itens relacionados. Neste espaço, será apresentado todos os quadrinhos em que o personagem tem participação.

Para Quadrinho, a tela também exibirá uma miniatura da capa, o título e uma descrição detalhada do conteúdo. Além disso, haverá um espaço para itens relacionados, onde serão apresentados todos os personagens presentes no HQ.

Essa funcionalidade permite que o usuário tenha acesso a informações adicionais e relacionadas ao item pesquisado, facilitando a navegação e o entendimento do universo Marvel.

Além das funcionalidades já descritas, nas telas de Personagens e Quadrinhos, os usuários poderão favoritar qualquer item pesquisado, o que permitirá que eles sejam salvos em uma tela separada para acesso rápido posterior.

Além do menu principal, o aplicativo também possui um menu inferior fixo em todas as telas do aplicativo. O menu inferior leva para todas as páginas do aplicativo, permitindo que os usuários naveguem facilmente entre as diferentes telas.
  
Nela contém o Histórico, que armazena todo o histórico de pesquisa das telas de Personagens e Quadrinhos. A tela exibe todos os itens pesquisados e permite que os usuários revisitem as informações novamente.

URL da Documentação: https://developer.marvel.com/docs

URL de acesso a API: https://gateway.marvel.com

Dados de autenticação: endereço de email e token da APi.

Endpoints (GET): 

/characters: busca listas de personagens.

/characters/{characterId}: busca um único personagem po ID.

/characters/{characterId}/comics: Busca listas de quadrinhos filtradas por um id de personagem.

/characters/{characterId}/events: Busca listas de eventos filtrados por um ID de personagem.

/characters/{characterId}/series: Busca listas de séries filtradas por um id de personagem.

/characters/{characterId}/stories: Busca listas de histórias filtradas por um id de personagem

/comics: Busca listas de quadrinhos.


/comics/{comicId}: Busca um único quadrinho por id.

/comics/{comicId}/characters: Obtém listas de personagens filtradas por um ID de quadrinhos.

/comics/{comicId}/creators: Busca listas de criadores filtradas por uma ID de quadrinhos.

/comics/{comicId}/events: Obtém listas de eventos filtradas por um ID de quadrinhos.

/comics/{comicId}/stories: Obtém listas de histórias filtradas por um ID de quadrinhos.

/creators: Busca listas de criadores.

/creators/{creatorId}: Busca um único criador por ID.

/creators/{creatorId}/comics: Busca listas de quadrinhos filtradas por um ID de criador

/creators/{creatorId}/events: Busca listas de eventos filtradas por um ID de criador.

/creators/{creatorId}/series: Busca listas de séries filtradas por um ID de criador.

/creators/{creatorId}/stories: Busca listas de histórias filtradas por um ID de criador.

/events: Busca listas de eventos.

/events/{eventId}: Busca um único evento por ID.

/events/{eventId}/characters: Busca listas de personagens filtradas por um ID de evento.

/events/{eventId}/comics: Busca listas de quadrinhos filtradas por um ID de evento.

/events/{eventId}/creators: Busca listas de criadores filtradas por um ID de evento.

/events/{eventId}/series: Busca listas de séries filtradas por um ID de evento 

/events/{eventId}/stories: Busca listas de histórias filtradas por um ID de evento.

/series: Busca listas de séries.

/series/{seriesId}: Busca uma única série de quadrinhos por ID.

/series/{seriesId}/characters: Busca listas de personagens filtradas por um ID de série.

/series/{seriesId}/comics: Busca listas de quadrinhos filtradas por um ID de série.

/series/{seriesId}/creators: Busca listas de criadores filtradas por um ID de série.

/series/{seriesId}/events:Busca listas de eventos filtradas por um ID de série.

/series/{seriesId}/stories: Busca listas de histórias filtradas por um ID de série.

/stories: Busca listas de histórias.

/stories/{storyId}: Busca uma única história em quadrinhos por ID.

/stories/{storyId}/characters: Busca listas de personagens filtradas por um ID de história.

/stories/{storyId}/comics: Busca listas de quadrinhos filtradas por um ID de história.

/stories/{storyId}/creators: Busca listas de criadores filtradas por um ID de história.

/stories/{storyId}/events: Busca listas de eventos filtradas por um ID de história.

/stories/{storyId}/series: Busca listas de séries filtradas por um ID de história.

Em nossa API de quadrinhos, usaremos os seguintes endpoints: "/characters" para obter informações sobre personagens, "/comics" para acessar informações sobre as histórias em quadrinhos e "/series" para informações sobre séries de quadrinhos.
Métodos:

Método: /v1/public/characters

Nome: Lista de Personagens
Identificação: characters
Tipo: GET
Descrição: Retorna uma lista de personagens da Marvel com informações básicas sobre cada um, incluindo seu nome, ID, descrição e uma imagem em miniatura.
Parâmetros:
-id (int, opcional): O ID exclusivo do recurso de personagem;

-name (string, opcional): O nome do personagem;

-description (string, opcional): Uma breve biografia ou descrição do personagem;

-modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

-resourceURI (string, opcional): o identificador de URL canônico para este recurso;

-urls (Array[Url], opcional): Um conjunto de URLs de sites públicos para o recurso;

-thumbnail (Image, opcional): A imagem representativa desse personagem;

-comics (ComicList, opcional): Uma lista de recursos contendo quadrinhos que apresentam esse personagem;

-stories (StoryList, opcional): Uma lista de recursos de histórias nas quais esse personagem aparece;

-events (EventList, opcional): Uma lista de recursos de eventos em que esse personagem aparece;

-series (SeriesList, opcional): Uma lista de recursos da série na qual este personagem aparece.
  
Método: /v1/public/comics

Nome: Lista de Quadrinhos
Identificação: comics
Tipo: GET
Descrição: Retorna uma lista de quadrinhos da Marvel com informações básicas sobre cada um, incluindo seu título, ID, descrição e uma imagem em miniatura.
Parâmetros:
id (int, opcional): O ID exclusivo do recurso de quadrinhos;

digitalId (int, opcional): O ID da representação em quadrinhos digital deste quadrinho. Será 0 se o quadrinho não estiver disponível digitalmente;

title (string, opcional): O título canônico da história em quadrinhos;

issueNumber (double, opcional): O número do problema na série (geralmente será 0 para formatos de coleção);

variantDescription (string, opcional): Se o problema for uma variante (por exemplo, uma capa alternativa, segunda impressão ou corte do diretor), uma descrição de texto da variante;

description (string, opcional): A descrição preferida do quadrinho;

modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

isbn (string, opcional): O ISBN do quadrinho (geralmente preenchido apenas para formatos de coleção);

upc (string, opcional): O número do código de barras UPC para o quadrinho (geralmente preenchido apenas para formatos periódicos);

diamondCode (string, opcional): O código Diamond para o quadrinho;

ean (string, opcional): O código de barras EAN para o quadrinho;

issn (string, opcional): O código de barras ISSN do quadrinho;

format (string, opcional): O formato de publicação da história em quadrinhos, por exemplo, história em quadrinhos, capa dura, brochura comercial;

pageCount (int, opcional): O número de páginas da história na história em quadrinhos;

textObjects (Array[TextObject], opcional): Um conjunto de sinopse de texto descritivo para a história em quadrinhos;

resourceURI (string, opcional): o identificador de URL canônico para este recurso;

urls (Array[Url], opcional): Um conjunto de URLs de sites públicos para o recurso;

series (SeriesSummary, opcional): Uma representação resumida da série à qual este quadrinho pertence;

variants (Array[ComicSummary], opcional): Uma lista de problemas variantes para este quadrinho (inclui o problema "original" se o problema atual for uma variante);

collections (Array[ComicSummary], opcional): Uma lista de coleções que incluem este quadrinho (geralmente estará vazia se o formato do quadrinho for uma coleção);

CollectIssues (Array[ComicSummary], opcional): Uma lista de edições coletadas neste quadrinho (geralmente estará vazia para formatos de periódicos como "quadrinhos" ou "revista");

dates (Array[ComicDate], opcional): Uma lista de datas importantes para este quadrinho;

prices (Array[ComicPrice], opcional): Uma lista de preços para este quadrinho;

thumbnail (Image, opcional): A imagem representativa deste quadrinho;

images (Array[Image], opcional): Uma lista de imagens promocionais associadas a este quadrinho;

creators (CreatorList, opcional): uma lista de recursos contendo os criadores associados a este quadrinho;

characters (CharacterList, opcional): Uma lista de recursos contendo os personagens que aparecem neste quadrinho;

stories (StoryList, opcional): Uma lista de recursos contendo as histórias que aparecem neste quadrinho;

events (EventList, opcional): Uma lista de recursos contendo os eventos em que este quadrinho aparece.


Método: /v1/public/creators

Nome: Lista de Criadores
Identificação: creators
Tipo: GET
Descrição: Retorna uma lista de criadores da Marvel com informações básicas sobre cada um, incluindo seu nome, ID e uma imagem em miniatura.
Parâmetros:
id (int, opcional): o ID exclusivo do recurso do criador;

firstName (string, opcional): O primeiro nome do criador;

middleName (string, opcional): O nome do meio do criador;

lastName (string, opcional): O sobrenome do criador;

suffix (string, opcional): O sufixo ou título honorífico do criador;

fullName (string, opcional): O nome completo do criador (uma concatenação separada por espaço dos quatro campos acima);

modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

resourceURI (string, opcional): o identificador de URL canônico para este recurso;

urls (Array[Url], opcional): Um conjunto de URLs de sites públicos para o recurso;

thumbnail (Image, opcional): A imagem representativa deste criador;

series (SeriesList, opcional): Uma lista de recursos contendo as séries que apresentam o trabalho deste criador;

stories (StoryList, opcional): Uma lista de recursos contendo as histórias que apresentam o trabalho deste criador;

comics (ComicList, opcional): Uma lista de recursos contendo os quadrinhos que apresentam o trabalho deste criador;

events (EventList, opcional): Uma lista de recursos contendo os eventos que apresentam o trabalho deste criador.

Método: /v1/public/events

Nome: Lista de Eventos
Identificação: events
Tipo: GET
Descrição: busca listas de eventos com filtros opcionais.
Parâmetros:
id (int, opcional): O ID exclusivo do recurso de evento;

title (string, opcional): O título do evento;

description (string, opcional): Uma descrição do evento;

resourceURI (string, opcional): o identificador de URL canônico para este recurso;

urls (Array[Url], opcional): Um conjunto de URLs de sites públicos para o evento;

modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

start (Date, opcional): A data de publicação da primeira edição neste evento;

end (Date, opcional): A data de publicação da última edição neste evento;

thumbnail (Image, opcional): A imagem representativa deste evento;

comics (ComicList, opcional): Uma lista de recursos contendo os quadrinhos neste evento;

stories (StoryList, opcional): Uma lista de recursos contendo as histórias neste evento;

series (SeriesList, opcional): Uma lista de recursos contendo a série neste evento;

characters (CharacterList, opcional): Uma lista de recursos contendo os caracteres que aparecem neste evento;

creators (CreatorList, opcional): Uma lista de recursos contendo criadores cujo trabalho aparece neste evento;

next (EventSummary, opcional): Uma representação resumida do evento que segue este evento;

previous (EventSummary, opcional): Uma representação resumida do evento que precedeu este evento.

Método: /v1/public/series

Nome: Lista de Séries
Identificação: series
Tipo: GET
Descrição: especifica o número máximo de séries para retornar
Parâmetros:
id (int, opcional): O ID exclusivo do recurso da série;

title (string, opcional): O título canônico da série;

description (string, opcional): Uma descrição da série;

resourceURI (string, opcional): o identificador de URL canônico para este recurso;

urls (Array[Url], opcional): Um conjunto de URLs de sites públicos para o recurso;

startYear (int, opcional): O primeiro ano de publicação da série;

endYear (int, opcional): O último ano de publicação da série (convencionalmente, 2099 para séries em andamento);

rating (string, opcional): A classificação de adequação à idade da série;

modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

thumbnail (Image, opcional): A imagem representativa desta série;

comics (ComicList, opcional): Uma lista de recursos contendo quadrinhos nesta série;

stories (StoryList, opcional): Uma lista de recursos contendo histórias que ocorrem nos quadrinhos desta série;

events (EventList, opcional): Uma lista de recursos contendo eventos que ocorrem nos quadrinhos desta série;

characters (CharacterList, opcional): Uma lista de recursos contendo personagens que aparecem nos quadrinhos desta série;

creators (CreatorList, opcional): uma lista de recursos de criadores cujo trabalho aparece nos quadrinhos desta série;

next (SeriesSummary, opcional): Uma representação resumida da série que segue esta série;

previous (SeriesSummary, opcional): Uma representação resumida da série que precedeu esta série.

Método: /v1/public/stories

Nome: Lista de Histórias
Identificação: stories
Tipo: GET
Descrição: especifica o número máximo de histórias para retornar.
Parâmetros:
id (int, opcional): O ID exclusivo do recurso da história;

title (string, opcional): O título da história;

description (string, opcional): Uma breve descrição da história;

resourceURI (string, opcional): o identificador de URL canônico para este recurso;

type (string, opcional): O tipo de história, por exemplo, história interior, capa, história de texto;

modified (Date, opcional): A data em que o recurso foi modificado mais recentemente;

thumbnail (Image, opcional): A imagem representativa desta história;

comics (ComicList, opcional): Uma lista de recursos contendo quadrinhos nos quais esta história ocorre;

series (SeriesList, optional): Uma lista de recursos contendo séries nas quais esta história aparece;

events (EventList, opcional): Uma lista de recursos dos eventos em que esta história aparece;

characters (CharacterList, opcional): Uma lista de recursos de personagens que aparecem nesta história;

creators (CreatorList, opcional): uma lista de recursos de criadores que trabalharam nesta história;

originalissue (ComicSummary, opcional): Uma representação resumida da edição na qual esta história foi originalmente publicada.
</div>
