//package com.example.mmc.bookhouse.ui;
//
//
//import android.graphics.Color;
//import android.support.v7.widget.LinearLayoutManager;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import com.example.mmc.bookhouse.R;
//import com.example.mmc.bookhouse.adapter.SwipeAdapter;
//import com.example.mmc.bookhouse.ui.base.BaseActivity;
//import com.yanzhenjie.recyclerview.OnItemMenuClickListener;
//import com.yanzhenjie.recyclerview.SwipeMenu;
//import com.yanzhenjie.recyclerview.SwipeMenuBridge;
//import com.yanzhenjie.recyclerview.SwipeMenuCreator;
//import com.yanzhenjie.recyclerview.SwipeMenuItem;
//import com.yanzhenjie.recyclerview.SwipeRecyclerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//
//
///**
// * Created by wangjiao on 2019/6/6.
// * 功能描述：
// */
//
//public class TextActivity extends BaseActivity {
//
//    @BindView(R.id.rlv)
//    SwipeRecyclerView mRecyclerView;
//    private List<String> mDatas = new ArrayList();
//    private SwipeAdapter mAdapter;
//
//    @Override
//    protected int getResId() {
//        return R.layout.activity_test;
//    }
//
//    @Override
//    protected void initView() {
//        for(int i=0;i<10;i++){
//            mDatas.add("数据---"+i);
//        }
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setSwipeMenuCreator(swipeMenuCreator);
//        mRecyclerView.setOnItemMenuClickListener(mMenuItemClickListener);
//
//        mAdapter = new SwipeAdapter(this,mDatas);
//        mRecyclerView.setAdapter(mAdapter);
//    }
//    /**
//     * 菜单创建器，在Item要创建菜单的时候调用。
//     */
//    private SwipeMenuCreator swipeMenuCreator = new SwipeMenuCreator() {
//        @Override
//        public void onCreateMenu(SwipeMenu swipeLeftMenu, SwipeMenu swipeRightMenu, int position) {
//            int width = getResources().getDimensionPixelSize(R.dimen.dp_70);
//
//            // 1. MATCH_PARENT 自适应高度，保持和Item一样高;
//            // 2. 指定具体的高，比如80;
//            // 3. WRAP_CONTENT，自身高度，不推荐;
//            int height = ViewGroup.LayoutParams.MATCH_PARENT;
//            // 添加右侧的，如果不添加，则右侧不会出现菜单。
//            {
//                SwipeMenuItem deleteItem = new SwipeMenuItem(TextActivity.this).setBackgroundColor(getResources().getColor(R.color.red))
//                        .setText("删除")
//                        .setTextColor(Color.WHITE)
//                        .setWidth(width)
//                        .setHeight(height);
//                swipeRightMenu.addMenuItem(deleteItem);// 添加菜单到右侧。
//            }
//        }
//    };
//
//    /**
//     * RecyclerView的Item的Menu点击监听。
//     */
//    private OnItemMenuClickListener mMenuItemClickListener = new OnItemMenuClickListener() {
//        @Override
//        public void onItemClick(SwipeMenuBridge menuBridge, int position) {
//            menuBridge.closeMenu();
//
//            int direction = menuBridge.getDirection(); // 左侧还是右侧菜单。
//            int menuPosition = menuBridge.getPosition(); // 菜单在RecyclerView的Item中的Position。
//
//            if (direction == SwipeRecyclerView.RIGHT_DIRECTION) {
//                Toast.makeText(TextActivity.this, "list第" + position + "; 右侧菜单第" + menuPosition, Toast.LENGTH_SHORT)
//                        .show();
//                mDatas.remove(position);
//                mAdapter.notifyDataSetChanged();
//
//
//            } else if (direction == SwipeRecyclerView.LEFT_DIRECTION) {
//                Toast.makeText(TextActivity.this, "list第" + position + "; 左侧菜单第" + menuPosition, Toast.LENGTH_SHORT)
//                        .show();
//            }
//        }
//    };
//}
