package com.whereit.oquetemsp.ui


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.model.LatLng

import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.Categories
import com.whereit.oquetemsp.domain.InterestingPoint
import kotlinx.android.synthetic.main.fragment_explorar.*

/**
 * A simple [Fragment] subclass.
 */
class ExplorarFragment : Fragment(), ExploringPointsAdapter.ExploringPointsClick {


    lateinit var instance: View
    lateinit var exploringAdapter: ExploringPointsAdapter
    lateinit var categoriesAdapter: CategoriesAdapter
    lateinit var pointsList: MutableList<InterestingPoint>
    lateinit var categories: MutableList<Categories>
    lateinit var recyclerExplorar: RecyclerView
    lateinit var recyclerCategories: RecyclerView
    lateinit var txtSeeMoreCategory: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        instance = inflater.inflate(R.layout.fragment_explorar, container, false)

        recyclerExplorar = instance.findViewById(R.id.recyclerExplorar)
        recyclerCategories = instance.findViewById(R.id.recyclerCategories)
        txtSeeMoreCategory = instance.findViewById(R.id.txtSeeMoreCategory)

        txtSeeMoreCategory.setOnClickListener {
            startActivity(Intent(activity, CategoriasFullActivity::class.java))

        }


        recyclerExplorar.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerCategories.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)


        pointsList = mutableListOf()
        categories = mutableListOf()

        val point1 = InterestingPoint(
            "Parque do Ibirapuera",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.\n" +
                    "\n" +
                    "Inaugurado em 1954 com uma área de 158h (390 acres), entre as avenidas Pedro Álvares Cabral, República do Líbano e IV Centenário, o Parque Ibirapuera é um parque tombado e patrimônio histórico de São Paulo. Seus jardins foram desenhados pelo paisagista Otávio Augusto Teixeira Mendes, após o conceito e anteprojeto do paisagista Roberto Burle Marx, a quem foram inicialmente encomendados, encontrarem resistência para sua efetiva realização. Já as construções históricas como os pavilhões que abrigam museus, o auditório, marquise entre outras foram concebidas pelo arquiteto Oscar Niemeyer com projetos estruturais do engenheiro Joaquim Cardozo, e são tombadas pelo Instituto Patrimônio Histórico e Artístico Nacional. O parque como um todo é tombado pelo Conselho Municipal de Preservação do Patrimônio Histórico, Cultural e Ambiental da Cidade de São Paulo e pelo Conselho de Defesa do Patrimônio Histórico, Arqueológico, Artístico e Turístico do Estado de São Paulo.\n" +
                    "\n" +
                    "Com a ampliação da Av. Pedro Álvares Cabral e consequente separação de parte da áreas verde que passou a ser administrada separadamente do parque, sua área efetiva foi reduzida e hoje ficam dentro do parque pouco mais do que 130 hectares (322 acres) entre as avenidas que o limitam e dentro de sua certa. Desde 2003, a gestão do Parque Ibirapuera é feita pelo Conselho Gestor do Parque Ibirapuera e administração pelo Departamento de Parque e Áreas Verdes da Prefeitura de São Paulo. A partir de 2014, o parque também conta com uma organização de amigos consolidada, o Parque Ibirapuera Conservação, dedicada a fomentar o engajamento dos usuários no cuidar do parque, restaurar espaços e promover a melhoria das áreas verdes e abertas.\n" +
                    "\n" +
                    "No parque há diversos atrativos para o público desde passeios culturais e educativos como caminhadas monitoradas, atividades de birdwatching, possuindo esculturas, museus e monumentos históricos além dos jardins e paisagens repletas de flores e árvores. Há também aparelhos de ginástica, quadras, playground, quiosques, ciclovia e planetário. Por sua riqueza verde, esportiva e cultural, em 2015 foi elencado por um colunista do jornal britânico The Guardian, como um dos \"melhores parques do planeta\" junto a parques como o Buttes-Chaumont de Paris, o Boboli de Florença, a High Line de Nova Iorque, o Hampstead Heath de Londres e o Parque Güell de Barcelona.",
            "Parques",
            6554,
            "https://i0.wp.com/parqueibirapuera.org/wp/wp-content/uploads/2019/08/Aaaparque-ibirapuera-12marcosdomicio.jpg?w=1000&ssl=1",
            true,
            -23.5874162, -46.6576336

        )
        pointsList.add(point1)

        val point2 = InterestingPoint(
            "MASP",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.\n" +
                    "\n" +
                    "Inaugurado em 1954 com uma área de 158h (390 acres), entre as avenidas Pedro Álvares Cabral, República do Líbano e IV Centenário, o Parque Ibirapuera é um parque tombado e patrimônio histórico de São Paulo. Seus jardins foram desenhados pelo paisagista Otávio Augusto Teixeira Mendes, após o conceito e anteprojeto do paisagista Roberto Burle Marx, a quem foram inicialmente encomendados, encontrarem resistência para sua efetiva realização. Já as construções históricas como os pavilhões que abrigam museus, o auditório, marquise entre outras foram concebidas pelo arquiteto Oscar Niemeyer com projetos estruturais do engenheiro Joaquim Cardozo, e são tombadas pelo Instituto Patrimônio Histórico e Artístico Nacional. O parque como um todo é tombado pelo Conselho Municipal de Preservação do Patrimônio Histórico, Cultural e Ambiental da Cidade de São Paulo e pelo Conselho de Defesa do Patrimônio Histórico, Arqueológico, Artístico e Turístico do Estado de São Paulo.\n" +
                    "\n" +
                    "Com a ampliação da Av. Pedro Álvares Cabral e consequente separação de parte da áreas verde que passou a ser administrada separadamente do parque, sua área efetiva foi reduzida e hoje ficam dentro do parque pouco mais do que 130 hectares (322 acres) entre as avenidas que o limitam e dentro de sua certa. Desde 2003, a gestão do Parque Ibirapuera é feita pelo Conselho Gestor do Parque Ibirapuera e administração pelo Departamento de Parque e Áreas Verdes da Prefeitura de São Paulo. A partir de 2014, o parque também conta com uma organização de amigos consolidada, o Parque Ibirapuera Conservação, dedicada a fomentar o engajamento dos usuários no cuidar do parque, restaurar espaços e promover a melhoria das áreas verdes e abertas.\n" +
                    "\n" +
                    "No parque há diversos atrativos para o público desde passeios culturais e educativos como caminhadas monitoradas, atividades de birdwatching, possuindo esculturas, museus e monumentos históricos além dos jardins e paisagens repletas de flores e árvores. Há também aparelhos de ginástica, quadras, playground, quiosques, ciclovia e planetário. Por sua riqueza verde, esportiva e cultural, em 2015 foi elencado por um colunista do jornal britânico The Guardian, como um dos \"melhores parques do planeta\" junto a parques como o Buttes-Chaumont de Paris, o Boboli de Florença, a High Line de Nova Iorque, o Hampstead Heath de Londres e o Parque Güell de Barcelona.",
            "Museus",
            2782,
            "https://abrilexame.files.wordpress.com/2018/05/masp.jpg?quality=70&strip=info&resize=680,453",
            false,
            -23.5614091, -46.6580706
        )
        pointsList.add(point2)

        val point3 = InterestingPoint(
            "Edifício COPAN",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.\n" +
                    "\n" +
                    "Inaugurado em 1954 com uma área de 158h (390 acres), entre as avenidas Pedro Álvares Cabral, República do Líbano e IV Centenário, o Parque Ibirapuera é um parque tombado e patrimônio histórico de São Paulo. Seus jardins foram desenhados pelo paisagista Otávio Augusto Teixeira Mendes, após o conceito e anteprojeto do paisagista Roberto Burle Marx, a quem foram inicialmente encomendados, encontrarem resistência para sua efetiva realização. Já as construções históricas como os pavilhões que abrigam museus, o auditório, marquise entre outras foram concebidas pelo arquiteto Oscar Niemeyer com projetos estruturais do engenheiro Joaquim Cardozo, e são tombadas pelo Instituto Patrimônio Histórico e Artístico Nacional. O parque como um todo é tombado pelo Conselho Municipal de Preservação do Patrimônio Histórico, Cultural e Ambiental da Cidade de São Paulo e pelo Conselho de Defesa do Patrimônio Histórico, Arqueológico, Artístico e Turístico do Estado de São Paulo.\n" +
                    "\n" +
                    "Com a ampliação da Av. Pedro Álvares Cabral e consequente separação de parte da áreas verde que passou a ser administrada separadamente do parque, sua área efetiva foi reduzida e hoje ficam dentro do parque pouco mais do que 130 hectares (322 acres) entre as avenidas que o limitam e dentro de sua certa. Desde 2003, a gestão do Parque Ibirapuera é feita pelo Conselho Gestor do Parque Ibirapuera e administração pelo Departamento de Parque e Áreas Verdes da Prefeitura de São Paulo. A partir de 2014, o parque também conta com uma organização de amigos consolidada, o Parque Ibirapuera Conservação, dedicada a fomentar o engajamento dos usuários no cuidar do parque, restaurar espaços e promover a melhoria das áreas verdes e abertas.\n" +
                    "\n" +
                    "No parque há diversos atrativos para o público desde passeios culturais e educativos como caminhadas monitoradas, atividades de birdwatching, possuindo esculturas, museus e monumentos históricos além dos jardins e paisagens repletas de flores e árvores. Há também aparelhos de ginástica, quadras, playground, quiosques, ciclovia e planetário. Por sua riqueza verde, esportiva e cultural, em 2015 foi elencado por um colunista do jornal britânico The Guardian, como um dos \"melhores parques do planeta\" junto a parques como o Buttes-Chaumont de Paris, o Boboli de Florença, a High Line de Nova Iorque, o Hampstead Heath de Londres e o Parque Güell de Barcelona.",
            "Edíficios",
            1455,
            "https://www.gazetadopovo.com.br/haus/wp-content/uploads/2019/04/12110524/edificio-copan-marcelo-camargo-2-1002x564.jpg",
            true,
            -23.5466098, -46.64704
        )
        pointsList.add(point3)

        val point4 = InterestingPoint(
            "Parque Vila Lobos",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.",
            "O Parque Ibirapuera é um parque urbano na cidade de São Paulo, Brasil. Em 2017, foi o parque mais visitado da América Latina, com aproximadamente 14 milhões de visitas, além de ser um dos locais mais fotografados do mundo.\n" +
                    "\n" +
                    "Inaugurado em 1954 com uma área de 158h (390 acres), entre as avenidas Pedro Álvares Cabral, República do Líbano e IV Centenário, o Parque Ibirapuera é um parque tombado e patrimônio histórico de São Paulo. Seus jardins foram desenhados pelo paisagista Otávio Augusto Teixeira Mendes, após o conceito e anteprojeto do paisagista Roberto Burle Marx, a quem foram inicialmente encomendados, encontrarem resistência para sua efetiva realização. Já as construções históricas como os pavilhões que abrigam museus, o auditório, marquise entre outras foram concebidas pelo arquiteto Oscar Niemeyer com projetos estruturais do engenheiro Joaquim Cardozo, e são tombadas pelo Instituto Patrimônio Histórico e Artístico Nacional. O parque como um todo é tombado pelo Conselho Municipal de Preservação do Patrimônio Histórico, Cultural e Ambiental da Cidade de São Paulo e pelo Conselho de Defesa do Patrimônio Histórico, Arqueológico, Artístico e Turístico do Estado de São Paulo.\n" +
                    "\n" +
                    "Com a ampliação da Av. Pedro Álvares Cabral e consequente separação de parte da áreas verde que passou a ser administrada separadamente do parque, sua área efetiva foi reduzida e hoje ficam dentro do parque pouco mais do que 130 hectares (322 acres) entre as avenidas que o limitam e dentro de sua certa. Desde 2003, a gestão do Parque Ibirapuera é feita pelo Conselho Gestor do Parque Ibirapuera e administração pelo Departamento de Parque e Áreas Verdes da Prefeitura de São Paulo. A partir de 2014, o parque também conta com uma organização de amigos consolidada, o Parque Ibirapuera Conservação, dedicada a fomentar o engajamento dos usuários no cuidar do parque, restaurar espaços e promover a melhoria das áreas verdes e abertas.\n" +
                    "\n" +
                    "No parque há diversos atrativos para o público desde passeios culturais e educativos como caminhadas monitoradas, atividades de birdwatching, possuindo esculturas, museus e monumentos históricos além dos jardins e paisagens repletas de flores e árvores. Há também aparelhos de ginástica, quadras, playground, quiosques, ciclovia e planetário. Por sua riqueza verde, esportiva e cultural, em 2015 foi elencado por um colunista do jornal britânico The Guardian, como um dos \"melhores parques do planeta\" junto a parques como o Buttes-Chaumont de Paris, o Boboli de Florença, a High Line de Nova Iorque, o Hampstead Heath de Londres e o Parque Güell de Barcelona.",
            "Parques",
            1874,
            "https://2.bp.blogspot.com/-hXh3Qu5EvrU/W_0iQ052rEI/AAAAAAACy9E/Nti1kqK3kWYEEKB4pBN8LTQlbkJmqFO6ACLcBGAs/s1600/parque-villa-lobos-sp-11.jpg",
            false,
            -23.5457778, -46.7227667
        )
        pointsList.add(point4)

        exploringAdapter = ExploringPointsAdapter(pointsList, this)
        recyclerExplorar.adapter = exploringAdapter


        val category6 = Categories(
            "Edíficios",
            "https://arquiteturaurbanismotodos.org.br/wp-content/uploads/2018/01/banespa%CC%83o-890x395_c.png"
        )
        categories.add(category6)

        val category7 = Categories(
            "Igrejas",
            "https://abrilviagemeturismo.files.wordpress.com/2016/10/catedral-da-se-em-sao-paulo-sp.jpeg?quality=70&strip=info&w=919"
        )
        categories.add(category7)


        val category4 = Categories(
            "Museus",
            "https://i0.wp.com/www.conhecendomuseus.com.br/wp-content/uploads/2016/08/mam.jpg?resize=720%2C350"
        )
        categories.add(category4)


        val category1 = Categories(
            "Parques",
            "https://checkinsaopaulo.com/wp-content/uploads/2016/07/Capa-1.jpg"
        )
        categories.add(category1)

        categoriesAdapter = CategoriesAdapter(categories)
        recyclerCategories.adapter = categoriesAdapter

        return instance
    }

    override fun onClick(interestingPoint: InterestingPoint) {

        var intent = Intent(activity, InterestingPointDetailActivity::class.java)
        intent.putExtra(getString(R.string.interesting_point), interestingPoint)
        startActivity(intent)

    }


}
