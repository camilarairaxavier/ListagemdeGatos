package com.camila.listagemdegatos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun DetailScreen(itemId: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Adicione espaço entre as margens da tela
        horizontalAlignment = Alignment.CenterHorizontally // Centraliza o texto
    ) {
        if (itemId == 0) {
            Text(
                text = "Gato Maine Coon",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold,
            )
            AsyncImage(
                modifier = Modifier
                    .size(390.dp, 390.dp)
                    .clip(RoundedCornerShape(4.dp)),
                model = "https://blog-static.petlove.com.br/wp-content/uploads/2018/05/Maine-Coon.jpg?_gl=1*la2m9d*_gcl_au*MTMzMjc3MDgwNS4xNjk0MjAzNjcz&_ga=2.47814759.137952767.1694203673-1552393838.1694203673",
                contentDescription = null
            )
            Text(
                text = "Maine Coon é uma raça de gato originária do nordeste dos Estados Unidos. É considerada a raça de pelo mais antiga, além de ser a maior de todas as raças de gato do mundo. Foi reconhecida como raça oficial no estado norte-americano do Maine, onde era famoso pela sua capacidade de caçar ratos e tolerar climas rigorosos. Também é conhecido como \"o gigante gentil\".",
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )

        } else if (itemId == 1) {
            Text(
                text = "Gato Bombaim",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold
            )
            AsyncImage(
                modifier = Modifier
                    .size(390.dp, 390.dp)
                    .clip(RoundedCornerShape(4.dp)),
                model = "https://i0.wp.com/petcaramelo.com/wp-content/uploads/2021/05/Gato-Bombaim-pose.jpg?resize=551%2C367&ssl=1",
                contentDescription = null,
            )
            Text(
                text = "Bombaim é uma raça de gatos de pelagem curta e preta, originária dos Estados Unidos da América.[1] A história dessa raça começa quando a norte-americana Nikki Horner decidiu criar um gato que fosse a miniatura de uma pantera-negra.",
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )

        } else if (itemId == 2) {
            Text(
                text = "Gato Siamês",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold
            )
            AsyncImage(
                modifier = Modifier
                    .size(390.dp, 390.dp)
                    .clip(RoundedCornerShape(4.dp)),
                model = "https://love.doghero.com.br/wp-content/uploads/2020/11/portrait-two-identical-siamese-cats_158595-5728.jpg",
                contentDescription = null,
            )
            Text(
                text = "Gato siamês é uma raça de gato oriental, caracterizada por um corpo elegante e esguio e uma cabeça marcadamente triangular. Pode ser confundido com a raça de gatos Thai que tem origem na raça siamesa mas apresenta uma morfologia bem distinta — O gato Thai é semelhante ao siamês antigo.",
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        } else if (itemId == 3) {
            Text(
                text = "Gato Persa",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold
            )
            AsyncImage(
                modifier = Modifier
                    .size(390.dp, 390.dp)
                    .clip(RoundedCornerShape(4.dp)),
                model = "https://blog.petdoginbox.com.br/wp-content/uploads/2022/04/gato-persa.jpg",
                contentDescription = null,
            )
            Text(
                text = "Persa é uma raça de gato doméstico originária do Irã, antiga Pérsia. É conhecido por sua aparência chamativa, de muita pelagem e focinho achatado. são animais muito tranquilos, que se dão bem com crianças, outros animais e apreciam ambientes calmos. Apesar de dóceis e calmos, eles também gostam de brincar e passar tempo ao lado de seus tutores",
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        } else if (itemId == 4) {
            Text(
                text = "Gato Angorá",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold
            )
            AsyncImage(
                modifier = Modifier
                    .size(390.dp, 390.dp)
                    .clip(RoundedCornerShape(4.dp)),
                model = "https://sobreseupet.com.br/wp-content/uploads/2022/09/gato-angora-5.jpg",
                contentDescription = null,
            )
            Text(
                text = "O gato angorá é uma raça de gato doméstico. É uma das raças mais antigas e naturais, tendo surgido na região de Ancara, na Turquia. A raça tem sido documentada desde o início do século XVII e acredita-se ser a origem das mutações, tanto para a coloração branca e pelos longos.",
                textAlign = TextAlign.Justify, // justifica o texto, distribuindo uniformemente entre as margens da tela.
                fontSize = 18.sp
            )
        }
    }
}





