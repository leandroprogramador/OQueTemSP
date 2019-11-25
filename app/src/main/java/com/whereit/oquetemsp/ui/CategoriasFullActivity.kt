package com.whereit.oquetemsp.ui

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.Categories
import kotlinx.android.synthetic.main.activity_categorias_full.*

class CategoriasFullActivity : AppCompatActivity(), CategoriesFullAdapter.ICategoriaClick {



    lateinit var categoriesAdapter: CategoriesFullAdapter
    var categories: MutableList<Categories> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_full)


        if(Build.VERSION.SDK_INT >= 21){
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = Color.TRANSPARENT

        }

        recyclerCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val category5 = Categories(
            "Céu Aberto",
            "https://statig2.akamaized.net/bancodeimagens/42/k1/ni/42k1nimijfhovozm0rfu8710o.jpg"
        )
        categories.add(category5)

        val category6 = Categories(
            "Edíficios",
            "https://arquiteturaurbanismotodos.org.br/wp-content/uploads/2018/01/banespa%CC%83o-890x395_c.png"
        )
        categories.add(category6)

        val category3 = Categories(
            "Gastronomia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Feira_da_liberdade_s%C3%A3o_paulo_barraca.jpg/800px-Feira_da_liberdade_s%C3%A3o_paulo_barraca.jpg"
        )
        categories.add(category3)

        val category7 = Categories(
            "Igrejas",
            "https://abrilviagemeturismo.files.wordpress.com/2016/10/catedral-da-se-em-sao-paulo-sp.jpeg?quality=70&strip=info&w=919"
        )
        categories.add(category7)

        val category2 = Categories(
            "Monumentos",
            "https://images.vice.com/vice/images/articles/meta/2016/09/30/monumentos-nao-foram-pixados-sp-1475253557.jpg"
        )
        categories.add(category2)

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

        categoriesAdapter = CategoriesFullAdapter(categories, this@CategoriasFullActivity)
        recyclerCategories.adapter = categoriesAdapter
    }

    override fun onClick(category: Categories) {
        val intent : Intent = Intent(this@CategoriasFullActivity, CategoriesActivity::class.java)
        intent.putExtra(getString(R.string.categories), category)
        startActivity(intent)
    }
}
