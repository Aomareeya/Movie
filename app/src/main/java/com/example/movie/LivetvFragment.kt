package com.example.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.movie.Adapter.ParentAdapter
import com.example.movie.databinding.FragmentLivetvBinding
import com.example.movie.model.Parent
import java.util.ArrayList

class LivetvFragment : Fragment() {

    private lateinit var binding: FragmentLivetvBinding

    val list = mutableListOf<Parent>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLivetvBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageSlider_livetv = view.findViewById<ImageSlider>(R.id.imageSlider_livetv)
        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://s359.thaibuffer.com/pagebuilder/218033b2-ca1b-4575-bf39-6c5d3cb33e10.jpg",
                "Itaewon Class"
            )
        )
        imageList.add(
            SlideModel(
                "https://specphone.com/web/wp-content/uploads/2021/05/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Doctor-Stranger-768x432.jpg",
                "Doctor Stranger : อัจฉริยะหมอ 2 แผ่นดิน"
            )
        )
        imageList.add(
            SlideModel(
                "https://s359.thaibuffer.com/pagebuilder/74de2b02-f9c4-4ffa-ba85-1d30359ecc58.jpg",
                " Vagabond"
            )
        )
        imageList.add(
            SlideModel(
                "https://specphone.com/web/wp-content/uploads/2021/05/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-The-Uncanny-Counter-768x432.jpg",
                "The Uncanny Counter : เคาน์เตอร์ คนล่าปีศาจ"
            )
        )
        imageList.add(
            SlideModel(
                "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-hospital-playlist-768x432.jpg",
                " Hospital Playlist : เพลย์ลิสต์ชุดกาวน์"
            )
        )
        imageList.add(
            SlideModel(
                "https://specphone.com/web/wp-content/uploads/2021/05/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-start-up-768x432.jpg",
                " Start – up : สตาร์ทอัพ"
            )
        )
        imageList.add(
            SlideModel(
                "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-18again-768x432.jpg",
                "18 Again : ย้อนรัก ย้อนวัยฝัน"
            )
        )

        imageSlider_livetv.setImageList(imageList, ScaleTypes.FIT)

        binding.recyclerview.apply {
            adapter = ParentAdapter(list)
        }
        val toolbarlive = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarlive)
        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbarlive)

        initList()

        initList()
    }

    private fun initList() {
        list.add(Parent("ซีรีส์เกาหลีสุดฮิต", mutableListOf("https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-15-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-16-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-17-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-35-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-37-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-36-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีโดนใจ", mutableListOf("https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-2-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-12-768x432.jpg", "https://www.จัดอันดับ.net/wp-content/uploads/2022/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B9%8C.jpg", "https://www.จัดอันดับ.net/wp-content/uploads/2022/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B9%8C22.png", "https://s359.thaibuffer.com/pagebuilder/e60d830d-1e12-4af6-b84c-a4b14c9c36d0.jpg", "https://s359.thaibuffer.com/pagebuilder/f28c2abe-9853-4819-b8ad-37b6d55df2eb.jpg")))
        list.add(Parent("ซีรีส์เกาหลีแนะนำ", mutableListOf("https://s359.thaibuffer.com/pagebuilder/303b79dc-a07d-4efa-8501-a6d7b50c3619.png", "https://s359.thaibuffer.com/pagebuilder/a28c0447-cb39-4e9c-a0a3-260d2caaac86.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-goblin-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-the-guest-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/05/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Revolutionary-Love-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Live-Up-to-Your-Name-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีติดอำดับ", mutableListOf("https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Whats-Wrong-with-Secretary-Kim-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-You-Who-Came-From-the-Stars-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Descendants-of-the-Sun-768x384.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-law-school-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Her-Private-Life-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-dr-romantic-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีโรแมนติก", mutableListOf("https://s359.thaibuffer.com/pagebuilder/5b26fa62-a6c9-401b-82cc-a713b5f4740e.jpg", "https://thethaiger.com/th/wp-content/uploads/sites/9/2021/11/New-Project-2021-11-09T111934.258.jpg", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/Nevertheless.jpg.webp", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/Legend-of-the-Blue-Sea.jpg.webp", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/W-Two-Worlds.jpg.webp", "https://www.you.co/th/wp-content/uploads/sites/9/2021/12/All-of-Us-are-Dead.jpg")))
        list.add(Parent("ซีรีส์เกาหลีดราม่า", mutableListOf("https://www.you.co/th/wp-content/uploads/sites/9/2022/01/Twenty-Five-Twenty-One.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/05/Money-Heist-Korea.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/03/The-Sound-of-Magic.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/03/Business-Proposal.jpg", "https://img-prod.api-onscene.com/cdn-cgi/image/format=auto%2Cwidth=1600%2Cheight=900/https://sls-prod.api-onscene.com/partner_files/trueidintrend/181275/22770566_1674547635929363_7897226834784595665_o.jpg", "https://cloudfront.tourkrub.co/uploads/ckeditor/pictures/6148/content_korean-series_8.jpg")))

        list.add(Parent("ซีรีส์เกาหลีสุดฮิต", mutableListOf("https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-15-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-16-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-17-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-35-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-37-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-36-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีโดนใจ", mutableListOf("https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-2-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2022/01/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-2022-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B9%81%E0%B8%99%E0%B8%A7%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%B7%E0%B8%9A%E0%B8%AA%E0%B8%A7%E0%B8%99-%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%A2%E0%B8%B8%E0%B8%84-12-768x432.jpg", "https://www.จัดอันดับ.net/wp-content/uploads/2022/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B9%8C.jpg", "https://www.จัดอันดับ.net/wp-content/uploads/2022/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B9%8C22.png", "https://s359.thaibuffer.com/pagebuilder/e60d830d-1e12-4af6-b84c-a4b14c9c36d0.jpg", "https://s359.thaibuffer.com/pagebuilder/f28c2abe-9853-4819-b8ad-37b6d55df2eb.jpg")))
        list.add(Parent("ซีรีส์เกาหลีแนะนำ", mutableListOf("https://s359.thaibuffer.com/pagebuilder/303b79dc-a07d-4efa-8501-a6d7b50c3619.png", "https://s359.thaibuffer.com/pagebuilder/a28c0447-cb39-4e9c-a0a3-260d2caaac86.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-goblin-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-the-guest-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/05/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Revolutionary-Love-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Live-Up-to-Your-Name-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีติดอำดับ", mutableListOf("https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Whats-Wrong-with-Secretary-Kim-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-You-Who-Came-From-the-Stars-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Descendants-of-the-Sun-768x384.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-law-school-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-Her-Private-Life-768x432.jpg", "https://specphone.com/web/wp-content/uploads/2021/04/%E0%B8%8B%E0%B8%B5%E0%B8%A3%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B9%8C%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%AB%E0%B8%A5%E0%B8%B5-Netflix-%E0%B9%81%E0%B8%99%E0%B8%B0%E0%B8%99%E0%B8%B3-dr-romantic-768x432.jpg")))
        list.add(Parent("ซีรีส์เกาหลีโรแมนติก", mutableListOf("https://s359.thaibuffer.com/pagebuilder/5b26fa62-a6c9-401b-82cc-a713b5f4740e.jpg", "https://thethaiger.com/th/wp-content/uploads/sites/9/2021/11/New-Project-2021-11-09T111934.258.jpg", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/Nevertheless.jpg.webp", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/Legend-of-the-Blue-Sea.jpg.webp", "https://promotions.co.th/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/07/W-Two-Worlds.jpg.webp", "https://www.you.co/th/wp-content/uploads/sites/9/2021/12/All-of-Us-are-Dead.jpg")))
        list.add(Parent("ซีรีส์เกาหลีดราม่า", mutableListOf("https://www.you.co/th/wp-content/uploads/sites/9/2022/01/Twenty-Five-Twenty-One.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/05/Money-Heist-Korea.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/03/The-Sound-of-Magic.jpg", "https://www.you.co/th/wp-content/uploads/sites/9/2022/03/Business-Proposal.jpg", "https://img-prod.api-onscene.com/cdn-cgi/image/format=auto%2Cwidth=1600%2Cheight=900/https://sls-prod.api-onscene.com/partner_files/trueidintrend/181275/22770566_1674547635929363_7897226834784595665_o.jpg", "https://cloudfront.tourkrub.co/uploads/ckeditor/pictures/6148/content_korean-series_8.jpg")))
    }
}

