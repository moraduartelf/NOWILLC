package com.moraduartelf.nowillc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class BestolifeProducts extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestolife_products);
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Book> listBook = new ArrayList<>();
        List<Book> listBook2 = new ArrayList<>();
        List<Book> listBook3 = new ArrayList<>();
        List<Book> listBook4 = new ArrayList<>();
        List<Book> listBook5 = new ArrayList<>();
        listCategory.add(new Category("BESTOLIFE OIL AND GAS DRILLING", listBook));
        listBook.add(new Book(R.drawable.honeykote,"HONEY KOTE"));
        listBook.add(new Book(R.drawable.ggt_rsc_ht_grande,"GGT-RSC-HT"));
        listBook.add(new Book(R.drawable.bestolife_3000_grande,"BESTOLIFE 3000"));
        listBook.add(new Book(R.drawable.bestolife_3010_nm_special_grande,"3010 NM"));
        listBook.add(new Book(R.drawable.bestolife_3010_ultra_grande,"3010 ULTRA"));
        listBook.add(new Book(R.drawable.bestolife_60_leadbase_grande,"60 LEAD BASE"));
        listBook.add(new Book(R.drawable.bestolife_4010_nm_grande,"4010 NM"));
        listBook.add(new Book(R.drawable.bestolife_zn_50_grande,"ZN 50"));
        listBook.add(new Book(R.drawable.black_jack_grande,"BLACK JACK"));
        listBook.add(new Book(R.drawable.cal_bronze_grande_,"CAL BRONZE"));
        listBook.add(new Book(R.drawable.cal_bronze_lead_free_grande,"CAL BRONZE LEAD FREE"));
        listBook.add(new Book(R.drawable.copper_joint_grande_,"COPPER JOINT"));
        listBook.add(new Book(R.drawable.copper_joint_lead_free_grande,"COPPER JOINT LEAD FREE"));
        listBook.add(new Book(R.drawable.copper_supreme_special_blend_grande,"COPPER SUPREME"));
        listBook.add(new Book(R.drawable.copper_supreme_special_blend_plus_grande,"COPPER SUPREME PLUS"));
        listBook.add(new Book(R.drawable.mr_b_grande,"MR B"));
        listBook.add(new Book(R.drawable.pb_black_grande,"PB BLACK"));
        listBook.add(new Book(R.drawable.zn_60_grande,"ZN 60"));
        listBook.add(new Book(R.drawable.white_collar_grande,"WHITE COLLAR"));
        listBook.add(new Book(R.drawable.white_collar_premium_grande,"WHITE COLLAR PREMIUM"));
        listCategory.add(new Category("BESTOLIFE OIL AND GAS PRODUCTION", listBook2));
        listBook2.add(new Book(R.drawable.bestolife_2000_grande,"BESTOLIFE 2000"));
        listBook2.add(new Book(R.drawable.bestolife_storage_compound_grande,"BESTOLIFE BSC"));
        listBook2.add(new Book(R.drawable.bestolife_2000_nm_grande,"BESTOLIFE 2000 NM"));
        listBook2.add(new Book(R.drawable.bestolife_2010_nm_ultra_grande,"BESTOLIFE 2010 NM"));
        listBook2.add(new Book(R.drawable.bestolife_2020_grande,"BESTOLIFE 2020"));
        listBook2.add(new Book(R.drawable.bestolife_72733_grande,"BESTOLIFE 72733"));
        listBook2.add(new Book(R.drawable.bestolife_api_modified_grande,"BESTOLIFE API MODIFIED"));
        listBook2.add(new Book(R.drawable.bestolife_ggt_grande,"BESTOLIFE GGT"));
        listBook2.add(new Book(R.drawable.bestolife_metal_free_grande,"BESTOLIFE METAL FREE"));
        listBook2.add(new Book(R.drawable.bestolife_ptc_grande,"BESTOLIFE PTC"));
        listBook2.add(new Book(R.drawable.bestolife_zn_18_grande,"BESTOLIFE ZN 18"));
        listCategory.add(new Category("BESTOLIFE INDUSTRIAL DRILLING", listBook3));
        listBook3.add(new Book(R.drawable.bestolife_c_55_grande,"BESTOLIFE C-55"));
        listBook3.add(new Book(R.drawable.copper_rock_grande,"COPPER ROCK"));
        listBook3.add(new Book(R.drawable.copr_99_pumpable_grande,"COPPER 99 PUMPABLE"));
        listBook3.add(new Book(R.drawable.copr_plus_grande,"BESTOLIFE COPR PLUS"));
        listBook3.add(new Book(R.drawable.copr_plus_pumpable_grande,"COPR PLUS PUMPABLE"));
        listBook3.add(new Book(R.drawable.stinger_enviro_bucket_front_grande,"BESTOLIFE STINGER ENVIRO "));
        listBook3.add(new Book(R.drawable.stinger_hdd_all_season_front_grande,"STINGER HDD ALL SEASON"));
        listBook3.add(new Book(R.drawable.stinger_hdd_front_grande,"STINGER HDD COPPER"));
        listBook3.add(new Book(R.drawable.supr_copr_grande,"BESTOLIFE SUPR COPR"));
        listCategory.add(new Category("WATER WELL COMPOUNDS", listBook4));
        listBook4.add(new Book(R.drawable.copper_based_water_well_grande,"COPPER BASE WATER"));
        listCategory.add(new Category("MISCELLANEUOS", listBook5));
        listBook5.add(new Book(R.drawable.bee_lok,"BEE LOK"));
        listBook5.add(new Book(R.drawable.dope_brushes,"DOPE BRUSHES"));
        listBook5.add(new Book(R.drawable.mustache_brush,"MUSTACHE BRUSHES"));
        listBook5.add(new Book(R.drawable.plastic_pail_opener,"PLASTIC PAIL OPENER"));

        return listCategory;
    }
}